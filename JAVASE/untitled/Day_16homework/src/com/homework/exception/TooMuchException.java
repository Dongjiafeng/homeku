package com.homework.exception;

public class TooMuchException extends  Exception {
    public static void Message(){
        System.out.println("你输入的有误,密码要大于6位小于14位,请重新输入");
    }
}
