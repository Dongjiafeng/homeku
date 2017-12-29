package com.lanou3g.study;

import java.io.*;

public class Copy1Demo {
    public static void main(String[] args) throws IOException {
        File fr = new File("src/timg.jpg");
        byte[] by = new byte[1024*1024*10];
        FileInputStream fo = new FileInputStream(fr);
        File fl = new File("src/mmm3.jpg");
        FileOutputStream fs  = new FileOutputStream(fl);
            fo.read(by);
            fs.write(by);
         fo.close();
         fs.close();

    }
}
