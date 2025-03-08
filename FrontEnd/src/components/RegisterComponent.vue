<script>
import { userLogin, userShow } from '@/api/user';
export default {
    data () {
        return {
            inputWidth: 200,
            phoneNumber: '',
            password: '',
            password_confirm: '',
            admincode: '',
        }
    },
    methods: {
        clickme(){
            this.$router.push('/login')
        },
        registerRequest(){
            userRegister({
                phoneNumber: this.phoneNumber,
                password: this.password
            }).then((data) => {
                console.log("没写喵")
            })
        }
    },
}
</script>

<template>
    <div class="placeholder">
        <div class="list">
            <div class="inputComponent">
                <label for="phoneNumber">Phone Number</label>
                <p />
                <input id="phoneNumber" v-model="phoneNumber" type="text" required/>
            </div>
            <div class="inputComponent">
                <label for="password">Password</label>
                <p />
                <input id="password" v-model="password" type="password" required/>
            </div>
            <div class="inputComponent">
                <label for="passwordc">Input Your Password Again</label>
                <p />
                <input id="passwordc" v-model="password_confirm" type="password" required/>
            </div>
            <div class="inputComponent">
                <label for="admincode">verify code</label>
                <p />
                <input id="admincode" v-model="admincode" type="text" required/>
            </div>
        </div>
        <div class="opera">
            <button class="register-button" @click="registrRequest" type="submit">Register Now</button>
        </div>
        Already had an account? <a @click="clickme">Login</a>
    </div>
    
</template>

<style>
label {
    display: inline;
}
.register-button,
input,
label {
    margin: 0.1rem;
    padding: 0.2rem;
    font: 1rem 'Fira Sans';
    font-family: sans-serif;
    display: inline-block;
}
div.placeholder {
    display: block;
    position: relative;
    padding: 1rem;
    width: 100%;
}
div.inputComponent {
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
.register-button {
    padding: 0.5rem 2rem;
    display: inline-block;
    margin: auto;
    height: 100%;
    border: 2px solid #888;
    border-radius: 4px;
    transition: 0.4s;
    text-align: center;
    background-color: #66b345;
    color: #fff;
}
.opera {
    flex-wrap: nowrap;
    display: block;
    width: 80%;
    margin: auto;
    text-align: center;
    height:max-content;
}
.list {
    padding-right: 0;
    display: block;
    width: 80%;
    margin: auto;
}

@media (hover:hover){
    Button:hover {
        border-color: gray;
    }
}

.inputComponent:hover {
    border-color: grey;
}
</style>
