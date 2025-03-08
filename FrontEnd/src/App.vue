<script>
import { computed } from 'vue'
import { RouterLink, RouterView } from 'vue-router'

import tipBus from './utils/tipBus';
import NavigationBar from './components/NavigationBar.vue';
import MsgBox from './components/MsgBox.vue'

export default {
  components:{
    NavigationBar,
    MsgBox,
  },
  data() {
    return {
      tipstr: 'asd',
      tipShow: false,
      tipFocus: false,
      pageState: 0,
      currentUser: null,
    }
  },
  provide(){
    return {
      tipstr: computed(() => this.tipstr) 
    }
  },
  mounted() {
    //接收tip更改数据
    tipBus.on('tipSet',val => {
      if (! this.tipShow){
        this.tipShow = true;
      }
      if (this.tipFocus) {this.tipstr += ' | ' + val}
      else {this.tipstr = val}
      this.TipFlush();
      this.$refs.msgbox.updateMsg(this.tipstr, 1)
    })
    this.tipFocus = false;
  },
  methods: {
    TipFlush() {
      this.tipFocus = true;
      setTimeout(() => {
        this.tipFocus = false;
      }, 500)
      return;
    },
    PageSwitch(target,user) {
      this.pageState = target
      this.currentUser = user
    }
  }
}
</script>


<template>
  <div class="bgcolor"></div>
  <NavigationBar></NavigationBar>
  <main>
    <RouterView></RouterView>
  </main>
  <br>
  <strong>Current route path:</strong> {{ $route.fullPath }}
  <MsgBox ref="msgbox" class="top-element"/>
</template>

<style scoped>
.bgcolor {
  top: 0;
  position: fixed;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: -1;
  background-size: 100% 100%;
  background-attachment: fixed;
  background-color: #c3a8a8;
  background-image: linear-gradient(to top left, rgb(240, 208, 255) 0%, rgb(255, 247, 225) 100%);
}

.wrapper {
  margin:auto 0;
}
.top-element {
  z-index: 1;
}


.tipactive {
  /* tip动画效果 */
  animation: tip-focus-active 0.5s both;
}

.tips-enter-active {
  animation: tip-enter 0.25s
}
.tips-leave-active {
  animation: tip-leave 0.5s
}
@keyframes tip-enter {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@keyframes tip-leave {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@keyframes tip-focus-active {
  100%,0% {
    background-color: rgba(255, 255, 255, 0.5);
  }
  30% {
    background-color: rgba(255, 255, 255, 1);
  }
  
}


/* 响应式布局 - 小于 1000 px 时改为上下布局 */
@media screen and (max-width: 1024px) {
  header {
    display: flex;
    place-items: top;
    padding: calc(var(--section-gap) / 2);
  }

  header .wrapper {
    display: inline;
    place-items: flex-start;
    flex-wrap: wrap;
  } 
}
</style>
