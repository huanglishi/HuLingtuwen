package com.huling.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.huling.platform.util.HttpResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
    //登录
    @PostMapping("/login")
    public HttpResult add(){
        JSONObject obj = new JSONObject();
        obj.put("id",1);
        obj.put("token",1);
        return HttpResult.success("登录成功",obj);
    }
    //获取用户数据
    @GetMapping("/getUserInfo")
    public HttpResult getUserInfo(){
        JSONObject obj = new JSONObject();
        obj.put("id",1);
        obj.put("username",1);
        obj.put("realName","测试号");
        return HttpResult.success("获取用户数据",obj);
    }
    //退出登录
    @GetMapping("/logout")
    public HttpResult logout(){
        JSONObject obj = new JSONObject();
        return HttpResult.success("退出登录成功");
    }

}
