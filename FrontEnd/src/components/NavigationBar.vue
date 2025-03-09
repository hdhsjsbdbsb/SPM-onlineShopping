//NavigationBar

<script>
import { RouterLink } from 'vue-router'

export default {
    data() {
        return {
            UserProfileImg: '/src/assets/unknown_user.svg'
        }
    },
    methods: {
        goToLogin() {
            this.$router.push('/login')
        },
    }
}
</script>

<template>
    <Transition name="pages">
        <div class="header">
            <div class="mid-container">
                <img alt="logo" class="left-logo-aligner" src="/src/assets/icon.svg" />
                <div id="title" class="left-logo-aligner">SPMoS</div>
                <nav class="left-logo-aligner">
                    <RouterLink to="/">Home</RouterLink>
                    <RouterLink to="/about">About</RouterLink>
                </nav>
                <span class="placeholder" />
                <button class="right-state-aligner" @click="goToLogin">Sign in</button>
                <img alt="user-avatar" class="right-state-aligner" :src="UserProfileImg"/>
                <!--img alt="user-avatar" class="right-state-aligner" src="/src/assets/unknown_user.svg" /-->

            </div>
        </div>
    </Transition>
</template>

<style scoped>
.header {
    transition: 1.0s;
    top: 0px;
    left: 0%;
    position: fixed;
    width: 100%;
    height: 3cap;
    border: 0;
    box-shadow: 0px 5px 5px #888888;
    font: 1.5em sans-serif;
    background-color: rgb(249, 249, 249);
    z-index: 1;
}

/* 标题栏居中容器 */
.mid-container {
    margin: auto;
    position: relative;
    width: 96%;
    padding: 0% 2%;
    margin-top: 0.5rem;
    display: inline-block;
    /*作为垂直居中的父元素*/
    line-height: 2rem;
}

/* 左侧标题容器 */
.left-logo-aligner {
    float: left;
}

/* 右侧标题容器 */
.right-state-aligner {
    float: right;
}

/* 两边容器共有属性 */
.left-logo-aligner,
.right-state-aligner {
    vertical-align: middle;
    display: inline-block;
    height: 2rem;
    margin-left: 1rem;
}

.placeholder {
    margin: auto;
}

/* 按钮 */
button {
    border: 1px solid #888;
    border-radius: 4px;
    box-shadow: 0px 1px 1px #888888;
    font: 1rem sans-serif;
    transition: 0.2s;
}
button:hover {
    background-color: #cfcfcf;
}

/* 动画 */
.pages-enter-active,
.pages-leave-active {
    transition: 0.5s;
    transition-delay: 1.0s;
}

.pages-enter-to {
    opacity: 1;
}

.pages-leave-to {
    opacity: 0;
}
</style>