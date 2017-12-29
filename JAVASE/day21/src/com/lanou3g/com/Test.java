package com.lanou3g.com;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        静态的东西会随着类的加载而进入内存
        所以当我们为创建对象,只是将类对象加载时,
        会执行该类的静态代码块.
         */
//        Class  t = T.class;
        Class<?> aClass = Class.forName("com.lanou3g.com.T");
        T t =new T();
    }
}
