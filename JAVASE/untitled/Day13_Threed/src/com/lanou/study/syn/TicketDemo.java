package com.lanou.study.syn;

public class TicketDemo {
    private int ticket = 10000;
    /*
    锁
    首先要明确一点.锁是一个对象
    并且,可以是任意类型的对象
    synchronized,关键字,就可以给方法上一个锁,
    给方法上锁的时候.
    使用的对象是当前类的类对象.就是TicketDemo.class对象
    当一个线程进入到sellTicket方法时,
    该线程就会持这个锁对象.
    其他线程想进入sellTicket方法时,
    找不到锁对象,所以就不去.
    这时候只能等待,释放锁对象,下一个线程才能今天进去,
    这个现象,就是同步.

     */

    public synchronized void sellTicket(){
        for (int i = 0; i <2500 ; i++) {

            System.out.println(Thread.currentThread().getName()+"剩余票数:"+(--ticket));
        }

    }
}
