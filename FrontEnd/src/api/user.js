//user.js

import myAxios from "@/config/axios";

//用户登录
export function userLogin(username, password) {
    return myAxios({
        url: '/api/user/login',
        method: 'get',
        params: {
            'username':username,
            'password':password
        }
    })
}

//展示所有用户
export function userShow() {
    return myAxios({
        url: '/api/user/showall',
        method: 'get',
        params: undefined
    })
}