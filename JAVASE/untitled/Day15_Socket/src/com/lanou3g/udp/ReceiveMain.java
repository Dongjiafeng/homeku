package com.lanou3g.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMain {
    public static void main(String[] args) throws IOException {
        DatagramSocket  os  = new DatagramSocket();
        byte[]  beff  =new byte[1024];

        //定义一个数据包,用来接收数据
        DatagramPacket dp = new DatagramPacket(beff,0,beff.length);
        //调用ds的方法receive
        //会将ds接收到的数据.存到dp中
        while (true) {
            os.receive(dp);
            dp.getData();
            String hostName = dp.getAddress().getHostName();

            //根据dp过的字节.创建出字符
            String data = new String(dp.getData(), 0, dp.getLength());
            System.out.println(data+"============="+hostName);
        }



    }
}
