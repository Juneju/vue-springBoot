import request from "@/utils/request";
import qs from 'qs'
export function testGet(){
    return request({
        url:'/testGet',
        method:'get',
        params:{p:1}
    })
}

export function testPost(){
    return request({
        url:'/testPost',
        method:'post',
        params:{p:1},
        data:qs.stringify({s:2})
    })
}