package com.ysj.yiSheng.service.impl;

import com.google.gson.JsonObject;
import com.ysj.yiSheng.common.utils.ApiUtils;
import com.ysj.yiSheng.common.utils.WeLinkUtils;
import com.ysj.yiSheng.constant.WeLinkConstant;
import com.ysj.yiSheng.entity.MapperUser;
import com.ysj.yiSheng.entity.User;
import com.ysj.yiSheng.mapper.LoginMapper;
import com.ysj.yiSheng.service.LoginService;
import com.ysj.yiSheng.service.WeLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    protected LoginMapper loginMapper;
    @Autowired
    protected WeLinkService weLinkService;

    @Override
    public User getUserDetail(String access_token, String code) {
        String userDetail = WeLinkUtils.getUserDetail(access_token,code);
        if("".equals(userDetail) ) return null;
        WeLinkConstant.userId = ApiUtils.gsonJsonParse.fromJson(userDetail,JsonObject.class)
                .get("userId").toString().replaceAll("\"","");
        // 通知Redis将信息进行保存
        weLinkService.saveAcceeTokenOnRedis();
        // 将mapperUser数据进行加工
        return ApiUtils.combineJsonAndMapperDataToUser(userDetail, loginMapper.getUserDetail(WeLinkConstant.userId));
    }
}
