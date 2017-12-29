package com.lanou3g.study;

import java.io.*;

public class Duqu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/");
        FileInputStream  fi = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fi);
        Pet   p = (Pet)ois.readObject();
        System.out.println("他的名字是"+p.getName());
        System.out.println("他的性别是"+p.getGender());
        fi.close();
        ois.close();

    }

}
