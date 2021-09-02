package com.ysj.yiSheng.common.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ysj.yiSheng.entity.MapperUser;
import com.ysj.yiSheng.entity.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义一些解析函数
 */
public class ApiUtils {

    // gson 内自带的转换器，用于将gson类型的json字符串转化为jsonObject
    public static Gson gsonJsonParse = new Gson();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 转换时间 支持yyyy-MM-ss HH:mm:ss
    public static Date DateStringConvertToDate(String dateString){
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // 根据日期转换为指定的时间字符串格式
    public static String DateConvertToDateString(Date date){
        return dateFormat.format(date);
    }

    // 根据userDetail和mapper里面的user信息合并为一个真实的用户数据信息
    public static User combineJsonAndMapperDataToUser(String jsonString, MapperUser mapperUser){
        JsonObject userJson = gsonJsonParse.fromJson(jsonString, JsonObject.class);
        User user = User.builder().build();
        user.setMapperUser(mapperUser);

        if(userJson == null) return user;

        user.setUserId(userJson.get("userId").toString())
                .setAddress(userJson.get("address").toString())
                .setCorpUserId(userJson.get("corpUserId").toString())
                .setCreationTime(userJson.get("creationTime").toString())
                .setDeptCode(userJson.get("deptCode").toString())
                .setIsActivated(Byte.valueOf(userJson.get("isActivated").toString()))
                .setLastUpdatedTime(userJson.get("lastUpdatedTime").toString())
                .setMobileNumber(userJson.get("mobileNumber")==null?null:userJson.get("mobileNumber").toString())
                .setPhoneNumber(userJson.get("phoneNumber")==null?null:userJson.get("phoneNumber").toString())
                .setRemark(userJson.get("remark")==null?null:userJson.get("remark").toString())
                .setSecretary(userJson.get("secretary")==null?null:userJson.get("secretary").toString())
                .setSex(userJson.get("sex")==null?null:userJson.get("sex").toString())
                .setUserEmail(userJson.get("userEmail")==null?null:userJson.get("userEmail").toString())
                .setUserNameCn(userJson.get("userNameCn")==null?null:userJson.get("userNameCn").toString())
                .setUserNameEn(userJson.get("userNameEn")==null?null:userJson.get("userNameEn").toString())
                .setUserStatus(Byte.valueOf(userJson.get("userStatus").toString()));
        return user;
    }
}
