package com.ysj.yiSheng.service;

import com.ysj.yiSheng.entity.User;

@SuppressWarnings("all")
public interface LoginService {

    /**
     * 验证登陆信息，通过华为小程序的验证码登陆
     * @param access_token 令牌
     * @param code 前端传来的华为的验证码
     * @return 登陆的用户信息
     */
    User getUserDetail(String access_token, String code);

}
