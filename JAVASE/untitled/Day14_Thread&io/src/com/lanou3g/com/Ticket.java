package com.lanou3g.com;

public class Ticket {
    public void sellTick(){
        //大括号:代码块
        //synchronized:同步
        //所以这个代码快叫做同步代码快
        //synchronized 后面的括号中
        //要传入的.就是这个同步代码快的锁对象

        //this指的是本类对象
        //Ticket.class指的是这个类的类对象

        //本类对象指的是根据这个类创建出来的
        //类型为Ticket
        //类对象的类型为:Class


        synchronized (Ticket.class){
            for (int i = 0; i <10 ; i++) {
                try {
                    //请你等一等
                    //一旦锁定对象.运用wait方法
                    //那么当前运行的行程,就会失去执行
                    //并且失去抢夺的权利
                    //当锁定对象的notifyAll方法被调用后
                    //这个线程才可以重新开始抢夺执行权
                    //抢到后继续执行
                    Ticket.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("转了一圈--------"+i);

            }


        }

    }
    public  void continued(){
        synchronized (Ticket.class) {
            Ticket.class.notifyAll();
        }
    }
}
