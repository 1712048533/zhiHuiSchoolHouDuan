package com.ysj.yiSheng.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("all")
public class MapperUser implements Serializable {
    /**
     *     用户学号或教工号
     */
    private String id;
    /**
     * 用户账号id
     */
    private String userId;
    /**
     *     用户密码
     */
    private String password;
    /**
     *     用户头像地址
     */
    private String avatarUrl;
    /**
     *    用户昵称
     */
    private String nickName;
    /**
     * 用户的个性签名
     */
    private String mySaying;
    /**
     * 用户所在学校
     */
    private String school;
    /**
     * 用户所在学院
     */
    private String academy;
    /**
     * 用户所选专业
     */
    private String major;
    /**
     * 用户所在班级
     */
    private Byte classId;
    /**
     * 用户的身份
     * 0-教师 1-专科生 2-本科生 3-研究生
     */
    private Byte identity;
    /**
     * 用户入学时间
     */
    private String admissionTime;
    /**
     * 用户毕业时间
     */
    private String graduationTime;
}
