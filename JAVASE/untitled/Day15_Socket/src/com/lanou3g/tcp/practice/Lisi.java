package com.lanou3g.tcp.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Lisi {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Scanner input  = new Scanner(System.in);
        Socket s = serverSocket.accept();
        byte[] buff = new byte[1024];
        InputStream is = s.getInputStream();
        //获得与这个ServerSocket连接的Socket的输出流
        OutputStream os = s.getOutputStream();
        int len = 0 ;
        StringBuffer sb = new StringBuffer();
        while ((len = is.read(buff)) != -1){

                sb.append(new String(buff,0,len));
            System.out.println(sb);
            //把sb清空.
            sb.setLength(0);
            String reult = input.nextLine();
            os.write(reult.getBytes());
                }
        serverSocket.close();
    }
}
