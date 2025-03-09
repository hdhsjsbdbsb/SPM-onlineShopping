<script>
import { userLogin, userShow } from '@/api/user';
import MessageBus from '@/utils/MessageBus';
export default {
    data() {
        return {
            inputWidth: 200,
            username: '',
            password: ''
        }
    },
    methods: {
        goToMainPage() {
            this.$router.push('/')
        },
        goToRegister() {
            this.$router.push('/register')
        },
        loginRequest() {
            userLogin(this.username, this.password).then((result) => {
                if (result.code == 0) {
                    result.content = result.data
                    result.wait = true // 等待执行结果
                    result.callbacks = [this.goToMainPage]
                    window.localStorage.setItem("token", result.data) //储存token
                    MessageBus.emit('box', result) // 登陆成功消息框
                }
                else {
                    MessageBus.emit('box', result);
                }
            }, (err) => {
                MessageBus.emit('box', "无法连接至后端服务")
            })
        },
        showallRequest() {
            userShow().then((data) => {
                console.log(data);
            })
        }
    }
}
</script>

<template>
    <div class="panel">
        <div class="list">
            <div class="input-card">
                <label for="username">User Name / Phone Number</label>
                <p />
                <input id="username" v-model="username" type="text" required />
            </div>
            <div class="input-card">
                <label for="password">Password</label>
                <p />
                <input id="password" v-model="password" type="password" required />
            </div>
        </div>
        <div class="opera">
            <button class="submit-button" @click="loginRequest" type="submit">登录</button>
        </div>
        <h3>
            Haven't account?
            <a @click="goToRegister">Register</a>
        </h3>
    </div>

</template>

<style scoped>
label {
    display: inline;
}

h3 {
    text-align: left;
}

input,
label {
    margin: 0.1rem 0 0.1rem 0.1rem;
    padding: 0.2rem;
    font: 1rem 'Fira Sans';
    font-family: sans-serif;
    display: inline-block;
}

.opera {
    display: inline;
    width: 80%;
    margin: auto;
    text-align: center;
}

.list {
    margin: 2%;
    display: block;
    position: relative;
    width: 96%;
}

@media (hover:hover) {
    Button:hover {
        border-color: gray;
    }
}
</style>
