package com.ysj.yiSheng.service.impl;

import com.ysj.yiSheng.common.utils.RedisUtils;
import com.ysj.yiSheng.common.utils.WeLinkUtils;
import com.ysj.yiSheng.constant.WeLinkConstant;
import com.ysj.yiSheng.service.WeLinkService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class WeLinkServicelmpl implements WeLinkService {

    @Resource
    protected RedisUtils redisUtils;

    // 定时更新access_token, 键为 user_id，值为 access_token
    @Scheduled(initialDelay = 6600000,fixedRate = 6600000)
    @Override
    public void createAccessToken() {
        String accessToken = WeLinkUtils.getAuthAccessToken();
        WeLinkConstant.access_token = accessToken;
        if(null!=accessToken && !"".equals(accessToken)){
            if("".equals(WeLinkConstant.userId)) return;
            else this.saveAcceeTokenOnRedis();
        }else{
            throw new NullPointerException("创建了无效的access_token");
        }
    }

    @Override
    public String getAccessToken() {
        if ("".equals(WeLinkConstant.access_token) || !redisUtils.hasKey(WeLinkConstant.userId)) {
            this.createAccessToken();
            return WeLinkConstant.access_token;
        }
        return String.valueOf(redisUtils.get(WeLinkConstant.userId));
    }

    @Override
    public void saveAcceeTokenOnRedis() {
        //有效期设置1小时55分钟
        redisUtils.set(WeLinkConstant.userId, WeLinkConstant.access_token, 115, TimeUnit.MINUTES);
    }
}
