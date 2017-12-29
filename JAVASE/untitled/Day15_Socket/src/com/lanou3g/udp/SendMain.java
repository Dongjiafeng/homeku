package com.lanou3g.udp;

import com.lanou3g.util.Constants;

import java.io.IOException;
import java.net.*;

public class SendMain {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds  = new DatagramSocket(8081);
        InetAddress address = InetAddress.getByName("192.168.20.221");
        byte[] buff  = new byte[1024];
        buff = "85234".getBytes();

        //创建用来存储的数据的数据包
        DatagramPacket dp = new DatagramPacket(buff,buff.length,address,8080);
        ds.send(dp);

    }
}
