package com.ysj.yiSheng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 全局统一返回对象
 */
@Data
@AllArgsConstructor
public class GlobalResponseData<T> implements Serializable {
    private int status = 1;
    private int code = 200;
    private String msg = "ok";
    private T data;

    public GlobalResponseData(T data){
        this.data = data;
    }
}
