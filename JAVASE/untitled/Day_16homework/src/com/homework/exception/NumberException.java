package com.homework.exception;

public class NumberException extends Exception {
    public static  void Message(){
        System.out.println("注册帐号必须是手机号或邮箱");
    }
}
