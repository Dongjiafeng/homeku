package com.lanou.study;

import com.lanou.study.syn.TicketDemo;

public class Main4 {
    public static void main(String[] args) {
        /*
        synchronized
        同步: 如果你先开始了,那等你干完了我在干.

        异步:你干你的,我干我的
         */
        TicketDemo td = new TicketDemo();
        stat(td);
        stat(td);
        stat(td);
        stat(td);
    }

    private static void stat(TicketDemo td) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //在这个线程中.调用td的方法时
                //我们说这个现象为:
                //线程进入这个sellTicket方法
                    td.sellTicket();
            }
        }).start();
    }
}
