//axios.js

import axios from "axios";
import { transParams } from "@/utils/vineUtils";

axios.defaults.headers['Content-Type'] = 'application/json;charset=utf-8'
// 创建axios实例
const myAxios = axios.create({
    timeout: 5000, 
});

// request拦截
myAxios.interceptors.request.use(
    config => {
        // get delete 请求映射params函数
        if (config.method == 'get' || config.method == 'delete') {
            let url = config.url + '?' + transParams(config.params);
            console.log(url)
            url = url.slice(0, -1);
            config.params = {};
            config.url = url;
        }
        //post put 请求参数处理
        if (config.method == 'post' || config.method == 'put') {
            url: config.url;
            data:typeof config.data === 'object' ? JSON.stringify(config.data) : config.data;
        }
        // 更多配置...
        return config;
    },
    error => {
        console.error('请求错误：',error);
        return Promise.reject(error);
    }
);

//response 拦截
myAxios.interceptors.response.use(
    response => {
        const res = response.data;
        //根据返回的数据进行处理
        return res;
    },
    error => {
        console.error('请求错误：',error);
        return Promise.reject(error);
    }
)

export default myAxios;