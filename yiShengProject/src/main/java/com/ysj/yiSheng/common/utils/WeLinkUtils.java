package com.ysj.yiSheng.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonParser;
import com.huawei.welink.api.accesstoken.AuthV2TicketsRequest;
import com.huawei.welink.api.accesstoken.AuthV2TicketsResponse;
import com.huawei.welink.api.contact.user.*;
import com.huawei.welink.common.DefaultWeLinkClient;
import com.huawei.welink.common.exception.ApiException;
import com.ysj.yiSheng.constant.WeLinkConstant;

/**
 * 所有的weLink接口和相关的数据
 */
public class WeLinkUtils {

    // 这个是用于获取用户登陆时的access_token
    public static String getAuthAccessToken(){
        try {
            DefaultWeLinkClient client = new DefaultWeLinkClient(WeLinkConstant.userAuthUrl);
            AuthV2TicketsRequest req = new AuthV2TicketsRequest();
            req.setClientId(WeLinkConstant.clientId);
            req.setClientSecret(WeLinkConstant.clientSecret);
            AuthV2TicketsResponse rsp = client.execute(req);
            return rsp.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return "";
    }

    // 获取用户的userId
    public static String getUserIdAndCropUserId(String access_token,String code){
        if(null == access_token || "".equals(access_token)) return "";
        try {
            DefaultWeLinkClient client = new DefaultWeLinkClient(WeLinkConstant.userIdUrl);
            AuthV2UseridRequest req = new AuthV2UseridRequest();
            req.setAccessToken(access_token);
            req.setCode(code);
            AuthV2UseridResponse rsp = client.execute(req);
            return rsp.getUserId();
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return "";
    }

    // 根据access_token和user_id获取用户信息
    public static String getUserDetail(String access_token,String code){
        String userId = getUserIdAndCropUserId(access_token,code);
        System.out.println("拿到UserId："+userId);
        if("".equals(access_token) || "".equals(userId))
            return "";
        try {
            DefaultWeLinkClient client = new DefaultWeLinkClient(WeLinkConstant.userDetailUrl);
            ContactV3UsersRequest req = new ContactV3UsersRequest();
            req.setAccessToken(access_token);
            req.setUserId(userId);
            ContactV3UsersResponse rsp = client.execute(req);
            System.out.println(rsp.getBody());
            return rsp.getBody();
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return "";
    }
}
