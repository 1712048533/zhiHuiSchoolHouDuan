package com.ysj.yiSheng.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@Builder
@SuppressWarnings("all")
public class User implements Serializable {
    /**
     * UserId
     */
    private String userId;
    /**
     * 用户的状态
     * 1-未开户 2-开户中 3-已开户 4-已销户
     */
    private Byte userStatus;
    /**
     * 用户绑定的手机号码
     */
    private String mobileNumber;
    /**
     * 用户真实姓名（中文）
     */
    private String userNameCn;
    /**
     * 用户真实姓名（英文）
     */
    private String userNameEn;
    /**
     * 用户的性别
     * M-男 F-女
     */
    private String sex;
    /**
     * 该用户在租户自身系统的登录标识，用于认证和邮箱登录（客户唯一）
     * 字段可以为中文且区分大小写
     */
    private String corpUserId;
    /**
     * 用户的邮箱
     */
    private String userEmail;
    /**
     * 秘书（用户账号）
     */
    private String secretary;
    /**
     * 用户电话号码（座机）
     */
    private String phoneNumber;
    /**
     * 用户的地址
     */
    private String address;
    /**
     * 备注
     */
    private String remark;
    /**
     * 用户是否激活（用户登录WeLink客户端表示已激活）
     * 0-未激活 1-已激活
     */
    private Byte isActivated;
    /**
     * 创建时间
     */
    private String creationTime;
    /**
     * deptCode
     */
    private String deptCode;
    /**
     * lastUpdatedTime
     */
    private String lastUpdatedTime;
    /**
     * 自定义数据
     */
    private MapperUser mapperUser;
}
