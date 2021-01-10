import axios from "axios";

//创建axios实例
const service=axios.create({
    baseURL:process.env.VUE_APP_BASE_API,
    // `withCredentials` 表示跨域请求时是否需要使用凭证
    withCredentials: false, // default
    timeout:500000000
})

//request拦截器
service.interceptors.request.use(
    config=>{
        //在发送请求前加上token,如cookies等等
        config.headers['X-Token']='cookie sth'
        return config
    },
    error=>{
        //请求发送失败
        console.log(error)
        return Promise.reject(error)
    }
)

//response拦截器
service.interceptors.response.use(
    response=>{
        return response
    },
    error => {
        console.log(error)
        return Promise.reject(error)
    }
)


export default service