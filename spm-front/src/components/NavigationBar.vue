//NavigationBar

<script>
import { RouterLink } from 'vue-router'

export default {
    data() {
        return {
            userProfileImg: '/img/icons/unknown_user.svg',
            searchContent: ''
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
                <img alt="logo" class="left-logo-aligner" src="/img/icons/icon.svg" />
                <div id="title" class="left-logo-aligner">SPMoS</div>
                <nav class="left-logo-aligner">
                    <RouterLink to="/">Home</RouterLink>
                    <RouterLink to="/about">Categrey</RouterLink>
                </nav>
                <span class="placeholder" />
                <button class="right-state-aligner" @click="goToLogin">Sign in</button>
                <img alt="user-avatar" class="right-state-aligner" :src="userProfileImg"/>
                <div class="right-state-aligner">
                    <input id="search" v-model="searchContent" placeholder="Search..." class="search-input">
                    <img src="/img/icons/search.svg" class="search-text" v-show="searchContent">
                </div>
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
    z-index: 100;
    overflow: hidden;
}

/* 标题栏居中容器 */
.mid-container {
    margin: auto;
    position: relative;
    width: 100%;
    padding: 0% 1rem;
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
    text-align: center;
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

/* 搜索框 */
.search-input {
    float: right;
    display: block;
    width: 100%;
    padding: 0.4rem;
    background-color: #ebebeb;
    border-width: 1px 1px 1px 1px;
    border-radius: 0.2rem;
    font-size: medium;
}

/* 搜索悬浮图标 */
.search-text {
    display: flexbox;
    position: relative;
    height: 100%;
    right: -50%;
    transform: translateX(-60%);
    object-fit: contain;
    top: -100%;
    /*border: 1px solid #8a8a8a;*/
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