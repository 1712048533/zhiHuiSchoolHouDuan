package com.ysj.test;

import com.ysj.yiSheng.common.utils.ApiUtils;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class normalTest {

    @Test
    public void testNullToString(){
        Date date = null;
        System.out.println(date.toString());
    }

    @Test
    public void testDate(){

        System.out.println(ApiUtils.DateStringConvertToDate("2021-08-09 18:13:14"));
    }
}
