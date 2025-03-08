<script>
export default {
    data() {
        return {
            msg: '',
            type: 1,
            temp: null,
            visible: false,
        }
    },
    methods: {
        updateMsg(msg, type) {
            this.msg = msg
            this.type = type
            this.visible = true
        },
        updateTemp(tempdata) {
            this.temp = tempdata
        },
        hideBox(emits) {
            this.$emit('back', emits)
            this.visible = false
        }
    }
}
</script>


<template>
    <Transition name="c">
        <div v-show="visible" class="bgforbid">
            <div class="panel">
                <span class="row">
                    <!--img :src="imgurl"-->
                    <a class="divider">{{ msg }}</a>
                </span>
                <div class="operabtn" v-show="type == 1">
                    <button @click="hideBox(true)">确认</button>
                    <button @click="hideBox(false)">取消</button>
                </div>
            </div>
        </div>
    </Transition>
</template>

<style scoped>
.bgforbid {
    display: flex;
    align-items: center;
    /* 垂直居中 */
    justify-content: center;
    /* 水平居中 */
    position: fixed;
    width: 100%;
    height: 100%;
    left: 0;
    top: 0;
    background-color: #00000040;
    transition: 0.2s;
}

.panel {
    border-radius: 4px;
    display: block;
    position: relative;
    width: 80%;
    background-color: #ffffffcc;
    backdrop-filter: blur(10px);
    box-shadow: 0 10px 10px #00000040;
    padding: 1rem;
}

.row {
    position: relative;
    width: 90%;
    margin: auto;
    height: auto;
}

h1 {
    display: block;
}

img {
    width: 100%;
    height: auto;
    display: inline;
}

.c-enter-from {
    opacity: 0;
}

.c-enter-to {
    opacity: 1;
}

.c-leave-from {
    opacity: 1;
}

.c-leave-to {
    opacity: 0;
}

.operabtn {
    position: relative;
    display: inline;
    width: 100%;
    text-align: center;
    bottom: 2%;
}

.operabtn button {
    font-size: 1rem;
    background: none;
    border: 0px solid;
    border-radius: 4px;
    display: inline;
    margin: 0 0.2rem;
    padding: 1rem;
    transition: 0.3s;
    float: right;
}

.operabtn button:hover {
    background: #e072ff80;
    transition: 0.3s;
}

@media (min-width: 1024px) {
    .panel {
        width: 50%;
    }
}
</style>