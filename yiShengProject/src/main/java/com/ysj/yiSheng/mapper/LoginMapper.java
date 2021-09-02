package com.ysj.yiSheng.mapper;

import com.ysj.yiSheng.entity.MapperUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@SuppressWarnings("all")
@Mapper
public interface LoginMapper {

    @Select({"select * from WeLink_User where user_id = #{userId}"})
    public MapperUser getUserDetail(String userId);
}
