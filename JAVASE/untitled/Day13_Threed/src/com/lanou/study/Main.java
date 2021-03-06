package com.lanou.study;

public class Main {

    private static Thread thread;

    public static void main(String[] args) {
        /*
        线程:Thread
        什么是线程
        再讲线程之前,来说一下什么是进程?
        进程就是一个程序

         线程是程序中的执行单元

         进程中可以有多个线程

         正常情况下,每个线程都有自己独立的执行流程
         互不干扰

         如果人为写的话,可以让两个线程产生交集

         */
        //创建一个Thread的子类.
        thread = new HelloThread();
        //创建一个Runable接口的实现类
//        thread = new Thread(new HelloRunnable());
        //什么叫内部类?
        //定义在一个类内部的类.就叫内部类
        //没有名字的对象叫匿名对象
        //那么没有名字的类叫做匿名类
        //这个类又写在另一个类内中
        //所以我们叫他匿名内部类
//        thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <5000 ; i++) {
//                    System.out.println("我是匿名内部中的run:"+i);
//
//                }
//            }
//        });
//        thread = new Thread(){
//            @Override
//            public void run() {
//                super.run();
//            }
//        };

        //start方法,才是真正开启一个线程
        //thread.run(),只是调用了某个对象的方法
        //并没有开启线程,
        //自然也就不会出现交替输出的现象

        //开启一个线程
        thread.run();
        for (int i = 0; i <10000 ; i++) {
            //Thread的静态方法currentThread
            //可以帮助我们获得当前正在执行的线程对象
            //调用这个线程对象的getName方法获得名字
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }


    }
    /*
    什么是GC
    GC是java中的垃圾回收机制
    java在内存中创建的对象,程序员是不能手动销毁的,
    这也是java相对c的一个好处
    c程序员都需要手动销毁内存中内容,
    而我们java程序员就不需要做这个工作.由java内部
    内部的机制帮助我们管理内存.

    GC就是帮助我们把内存中不用的对象,
    销毁掉,释放内存空间

    当一个main方法执行是
    实际是启动了两个线程
    一个是在后台运行的GC
    一个是能看到的主线程
    注:GC什么时候销毁不是我们决定的,不由我们决定
     */
    /*
    线程的抢占式执行
         多个线程共同去争抢cpu的执行权
         谁抢到谁就执行
         所以看到多个线程交替输出的信息


  */
}
