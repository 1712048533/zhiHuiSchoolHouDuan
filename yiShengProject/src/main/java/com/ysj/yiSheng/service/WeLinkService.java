package com.ysj.yiSheng.service;

/**
 * 配置WeLink相关的事务，重点是access_token相关的逻辑
 */
public interface WeLinkService {

    public void createAccessToken();

    public String getAccessToken();

    public void saveAcceeTokenOnRedis();
}
