package com.homework.h1;

import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {
        Scanner input  = new Scanner(System.in);
        System.out.println("请注册,请输入昵称");
        String name1 = input.nextLine();
        System.out.println("请输入你的帐号");
        String username1 = input.nextLine();
        System.out.println("请输入你的密码");
        String password1 = input.nextLine();
        Person person = new Person(name1,username1,password1);
        Dataopen.register(name1,username1,password1,person);
        System.out.println("请登录,请输入帐号");
        String name2 = input.nextLine();
        System.out.println("请输入密码");
        String password2 = input.nextLine();
        Login.Login1(name2,password2);
        System.out.println("恭喜成功登录"+person.toString());
        System.out.println("请选择功能:  1.查询天气   2.查询手机号归属地 3.手速游戏  4查询手机前十用户 ");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;


        }




    }
}
