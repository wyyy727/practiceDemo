package com.zjm.practicedemo.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Date;
import java.util.Optional;

public class test01 {
    /**
     * 正则表达式：验证邮箱，多个以英文逗号分隔
     */
    public static final String REGEX_EMAIL_MULTI = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}(,([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,})*$";

    public static void main(String[] args) {
        //System.out.println(1);
        boolean isEmail = ReUtil.contains(Validator.EMAIL, "13@qq.com,13@qq.com");
        //System.out.println(isEmail);
        boolean isEmail1 = ReUtil.contains(Validator.EMAIL, "13@qq.com,13");
        //System.out.println(isEmail1);
        StrUtil.isEmpty("1");
        System.out.println(ReUtil.contains(REGEX_EMAIL_MULTI,"13@qq.com"));
        System.out.println(ReUtil.contains(REGEX_EMAIL_MULTI,"13@qq.com,13"));
        System.out.println(ReUtil.contains(REGEX_EMAIL_MULTI,"13@qq.com,13@163.com"));

        Date newDate = DateUtil.date();
        System.out.println(newDate);
        Long newDateLong = Optional.ofNullable(newDate).map(Date::getTime).orElse(new Long(0));
        System.out.println(newDateLong);
    }
}
