package com.homework.h1;


import com.homework.exception.*;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;

public class Dataopen {
    public static  void  register(String name,String username,String password,Person person) throws IOException, DocumentException {

        if ((password.length()<6)&&(password.length()>14)){
            try {
                throw new TooMuchException();
            } catch (TooMuchException e) {
                e.Message();
            }
        }
        try {
            Number.show(name);
        } catch (NumberException e) {
            e.Message();
        }
        if(password.matches("[a-z]")&&password.matches("[A-Z]")){

        }else {
            try {
                throw new ShortException();
            } catch (ShortException e) {
                e.Message();
            }
        }
        if (password.matches("[0,9]")){

        }else {
            try {
                throw new ShuziException();
            } catch (ShuziException e) {
                e.Message();
            }
        }
        try {
            Chongming.show(username);
        } catch (ChongmingException e) {
            e.Message();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        Usernames.open(person);
    }

}
