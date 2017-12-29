package Today;

import org.junit.jupiter.api.Test;
import yesterday.one.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    @Test
    public  void t1(){
       //刚刚添加的是java的测试包
       //使用这个包中的@Test注解
       //就可以单独运行这个t1方法

       /*
       递归
       递归就是自己调用自己
        */
       //show();
  // practice(1);
    }
    private  int i = 0;
    public  void show(){
        System.out.println("第"+(++i)+"次调用");
        if(i<9) {
            show();
        }
        System.out.println("第"+i+"次调用结束");
    }
    public  void practice(int num){
        for (int j = 1; j <=num ; j++) {
            System.out.print(j+"*"+num+"="+(j*num));
            System.out.print("\t");
        }
        System.out.println();
        num++;
        if(num==10){
            return;
        }
        practice(num);
    }
    @Test
    public void t2 () throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*
        反射是用来干嘛的?
        反射可以帮助我们在没有对象的情况下
        仅仅只有类的情况下.调用非静态的方法.
        调用私有的方法或属性.
         */

        //类对象
        //instance 实例
        //就是称呼不同.一个Hero类的实例
        // 就是一个Hero类的对象
        Object obj = Hero.class.newInstance();
        //方法对象
        Method skill = Hero.class.getMethod("skill");
        skill.invoke(obj);
//

    }
    @Test
    public void t3(){
        showName("张三");
        showName("张三","李四");
        String[] ns = {"张三","李四","王五","赵六"};
        //可以给多个字符串
        //也可以给单个给一个字符串
        //但是不能呢个字符串数组一起给
        showName(ns);
        showName();
    }

    /**
     * 演示可变参数
     * @param names
     */
    public void showName(String... names){
        //在方法体中.将参数names看成一个数组
        //数组的类型为String


        for (String name : names) {
            System.out.print(name+"\t");

        }
        System.out.println();


    }
    @Test
    public void t4() throws Exception {
        Student instance = Demo.getInstance(Student.class);
        Object o = Demo.getinstance("Today.Hero");
        System.out.println(o.toString());
    }

}
