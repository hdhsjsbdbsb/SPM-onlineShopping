<script setup>
import LoginComponent from './LoginComponent.vue';
import AboutView from './AboutView.vue';
import RegisterComponent from './RegisterComponent.vue';

defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>
<script>
export default {
  data() {
    return {
      show: 0,
      styleobj :{
          fontSize:'30px',
          color:'#cccccc',
          'text-align': 'center',
          'margin': 'auto'
      }
    }
  },
  methods: {
  }
}
</script>

<template>
  <Transition mode="out-in"  name="slide-fade">
    <div class="inner" v-if="show == 0">
      <LoginComponent @login="(user) => $emit('loginSuccess',user)" />
        <h1>{{ msg }}</h1>
    </div>
    
  </Transition>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  color: #566573;
  text-align: center;
  margin-top: auto;
}

h3 {
  font-size: 1.2rem;
  position: relative;
  outline-width: 2cap;
}

.inner h1,
.inner h3 {
  text-align: center;
}

.inner {
   display: block;
   position: absolute;
   width: 100%;
   left:0
}

@media (min-width: 1024px) {
  .inner h1,
  .inner h3 {
    text-align: center;
  }
}

.slide-fade-move,
.slide-fade-enter-active,
.slide-fade-leave-active {
  transition: all 0.3s ease-out;
}

.slide-fade-enter-from {
  transform: translateX(20px);
  opacity: 0;
}
.slide-fade-leave-to {
  transform: translateX(-20px);
  opacity: 0;
}

</style>
