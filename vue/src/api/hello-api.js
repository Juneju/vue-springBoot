import request from "@/utils/request";
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
        data:{p:2}
    })
}