//AboutView.vue

<script>
import { tempTest } from '@/api/temp';
import { ref } from "vue";
import MessageBus from '@/utils/MessageBus';
export default {
    setup() {
        let tempData = ref();
        function myTest(param) {
            tempTest(param).then((data) => {
                this.tempData = data;
                console.log("测试完成");
            },(err) => {
                console.log(err);
                MessageBus.emit('box',"无法连接到服务端");
            })
        }
        return {myTest, tempData};
    },
    methods: {
    }
};
</script>

<template>
    <div class="test">
        <h1>This is an about page.</h1>
        <button @click="myTest({'man':'whatcanisay'})">后端接口测试</button>
        <h3>获取到的数据: {{ tempData }}</h3>
    </div>
</template>

<style>

div.test {
    text-align: left;
    padding: 0 1rem 0 1rem;
    border-style: solid;
    border-width: 0 0 0 0.2rem;
    border-color: gainsboro;
    transition: 0.4s;
    display: block;
    width: 80%;
    margin: 2cap auto;
}

</style>