<script>
import { userShow, userRegister } from '@/api/user';
import MessageBus from '@/utils/MessageBus';
export default {
    data() {
        return {
            inputWidth: 200,
            phoneNumber: '',
            password: '',
            password_confirm: '',
            admincode: '246801',
            username: '',
            email: '',
        }
    },
    methods: {
        clickme() {
            this.$router.push('/login')
        },
        /* 注册请求 */
        registerRequest() {
            if (this.password != this.password_confirm) //检查密码码
            {
                MessageBus.emit('box',"The passwords entered are not the same.")
                return
            }
            if ( // 如果存在未填写的必需项目
                this.password == "" ||
                this.username == "" ||
                this.phoneNumber == ""
            ){ // 拒绝提交
                MessageBus.emit('box',"There are required items that have not been filled in, please check.")
                return
            }
            userRegister(
                this.username,
                this.password,
                this.email,
                this.phoneNumber,
            ).then((result) => {
                MessageBus.emit('box',result)
            },(err) => {
                MessageBus.emit('box',err)
            })
        }
    },
}
</script>

<template>
    <div class="panel">
        <div class="list">
            <div class="input-card">
                <label for="phoneNumber">Phone Number</label>
                <p />
                <input id="phoneNumber" v-model="phoneNumber" type="text" required />
            </div>
            <div class="input-card">
                <label for="username">Account Name (User Name)</label>
                <p />
                <input id="username" v-model="username" type="text" required />
            </div>
            <div class="input-card">
                <label for="password">Password</label>
                <p />
                <input id="password" v-model="password" type="password" required />
            </div>
            <div class="input-card">
                <label for="passwordc">Input Your Password Again</label>
                <p />
                <input id="passwordc" v-model="password_confirm" type="password" required />
            </div>
            <div class="input-card">
                <label for="email">E-mail (Optional)</label>
                <p />
                <input id="email" v-model="email" type="text"/>
            </div>
            <div class="input-card">
                <label for="admincode">verify code (DEV: readonly)</label>
                <p />
                <input id="admincode" v-model="admincode" type="text" required readonly/>
            </div>
        </div>
        <div class="opera">
            <button class="submit-button" @click="registerRequest" type="submit">Register Now</button>
        </div>
        <h3>
            Already had an account? 
            <a @click="clickme">Login</a>
        </h3>
    </div>

</template>

<style scoped>
label {
    display: inline;
}

input,
label {
    margin: 0.1rem;
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

.tips-text {
    display: flex;
    place-items: left;
    font-size: large;
    background-color: #fff;
}

@media (hover:hover) {
    Button:hover {
        border-color: gray;
    }
}
</style>
