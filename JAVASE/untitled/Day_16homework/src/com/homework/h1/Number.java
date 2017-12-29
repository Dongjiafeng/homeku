package com.homework.h1;

import com.homework.exception.NumberException;

public class Number {
    public static void show(String username) throws NumberException {
        if ((username.equals("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"))
                || (username.equals("^[1][34578]\\d{9}$"))) {

            System.out.println("可以注册");

        }else {
            throw new NumberException();
        }
    }
}
