<script>
import { userLogin, userShow } from '@/api/user';
import tipBus from '@/utils/tipBus';
export default {
    data() {
        return {
            inputWidth: 200,
            username: '',
            password: ''
        }
    },
    methods: {
        clickme() {
            this.$emit("back")
        },
        goToRegister() {
            this.$router.push('/register')
        },
        loginRequest() {
            userLogin(this.username, this.password).then((data) => {
                if (data.type == 'err')
                    tipBus.emit('tipSet', data.result);
                else {
                    tipBus.emit('tipSet', '登录成功')
                    this.$emit('login', data.result)
                }
            }, (err) => {
                tipBus.emit('tipSet', "无法连接至后端服务")
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
    <div class="placeholder">
        <div class="list">
            <div class="inputComponent">
                <label for="username">User Name / Phone Number</label>
                <p />
                <input id="username" v-model="username" type="text" required />
            </div>
            <div class="inputComponent">
                <label for="password">Password</label>
                <p />
                <input id="password" v-model="password" type="password" required />
            </div>
        </div>
        <div class="opera">
            <button class="smallButton" @click="loginRequest" type="submit">登录</button>
        </div>
        <h3>
            Haven't account?
            <a @click="goToRegister">Register</a>
        </h3>
    </div>

</template>

<style>
label {
    display: inline;
}
h3 {
    text-align: left;
}

.smallButton,
input,
label {
    margin: 0.1rem 0 0.1rem 0.1rem;
    padding: 0.2rem;
    font: 1rem 'Fira Sans';
    font-family: sans-serif;
    display: inline-block;
}

div.placeholder {
    display: block;
    position: relative;
    margin-top: 4rem;
    padding: 1rem;
    border: 2px solid darkgrey;
    border-radius: 4px;
    backdrop-filter: blur(10px);
    background-color: rgba(255, 255, 255, 0.5);
    box-shadow: 0px 10px 10px #888888;
    width: 90%;
    left: 5%;
}

div.inputComponent {
    text-align: left;
    margin: 1rem;
    border-style: solid;
    border-width: 0 0 0 0.2rem;
    border-color: gainsboro;
    transition: 0.4s;
    display: block;
    position: relative;
    width: 85%;
    padding: 0 0 0 1rem;
}

.backButton,
.smallButton {
    padding: 0.5rem;
    display: inline-block;
    margin: 0.5rem;
    height: 100%;
    border: 0px none;
    border-radius: 4px;
    transition: 0.4s;
    text-align: center;
    background-color: #ff950043;
}

.smallButton {
    width: 60%;
}

.backButton {
    width: 20%;
}

.opera {
    display: inline-block;
    width: 80%;
    margin: auto;
    text-align: center;
}

.list {
    margin: 2rem;
    display: inline;
    position: relative;
    width: 1000px;
}

@media (hover:hover) {
    Button:hover {
        border-color: gray;
    }
}

.inputComponent:hover {
    border-color: grey;
}
</style>
