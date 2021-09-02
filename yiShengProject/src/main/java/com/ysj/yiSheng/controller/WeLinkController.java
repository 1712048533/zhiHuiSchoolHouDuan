package com.ysj.yiSheng.controller;

import com.ysj.yiSheng.entity.GlobalResponseData;
import com.ysj.yiSheng.service.WeLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * welink组件相关的初始信息获取
 */
@RestController
@RequestMapping("/weLink")
@SuppressWarnings("all")
public class WeLinkController {

    @Autowired
    protected WeLinkService weLinkService;

    @RequestMapping("/getAccessToken")
    public GlobalResponseData getAccessToken(){
        String access_token = weLinkService.getAccessToken();
        if(access_token!=null && !"".equals(access_token)){
            return new GlobalResponseData(access_token);
        }
        return new GlobalResponseData(0,1001,"返回无效的access_token","");
    }
}
