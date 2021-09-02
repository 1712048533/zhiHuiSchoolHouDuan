package com.ysj.yiSheng.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.ysj.yiSheng.entity.GlobalResponseData;
import com.ysj.yiSheng.entity.User;
import com.ysj.yiSheng.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
@SuppressWarnings("all")
@RequestMapping("/user")
public class LoginController {

    @Autowired
    protected LoginService loginService;

    @RequestMapping("/login")
    public String getHuaWeiAuthCode(@RequestBody Map<String,Object> params){
        System.out.println("请求参数access_token = "+params.get("access_token").toString());
        System.out.println("去哪个参数code = "+params.get("code").toString());
        // res是一个json类型的字符串，用fastJson进行了封装，将JsonObject转换为JsonString
        User user = loginService.getUserDetail(params.get("access_token").toString(),params.get("code").toString());
        if(user!=null){
            return JSON.toJSONString(new GlobalResponseData(user));
        }return JSON.toJSONString(
                new GlobalResponseData(0,1001,"返回无效的access_token",""));
    }
}
