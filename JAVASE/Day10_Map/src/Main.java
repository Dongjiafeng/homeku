import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Map是什么？
        是一个接口
        Map 也是可以存放数据的
        Map存放的数据，都是键值对形式的。
        什么是键值对？

        name="zhangSan"
        age = 1
        gender = "男"

        这种--对应的关系。叫做键值对
         */

        Map map = new HashMap();
        //put方法，像map中添加信息

        //括号中接收两个参数
        //第一个参数表示(key)键
        //第二个参数表示(value)值
        map.put("name","王五");
        map.put("gender","男");
        map.put("age","11");

        System.out.println(map.get("name"));
        System.out.println("开始遍历了");

        for (Object o : map.keySet()) {
            //map.keySet将map中所有的key拿出来
            //增强for循环.也叫foreach
            //冒号后面,接收的是一个集合
            //也就是接收了一堆数据
            System.out.println(map.get(o).toString());
        }
//        second(map);
       // iterate(map);


    }

    private static void second(Map map) {
        System.out.println("遍历map的第二种方式");
        //获得m这个map中所有的值键对
        //放进了这个set集合中
        Set set = map.entrySet();
            /*
            collection是一个接口
            List和Set都是Collection的子接口

            我们使用的集合ArratList只是List的实现类
            List:有序(通过角标找元素),可重复
            Set:无序的.不可重复.

             */
        for (Object o1 : set) {
            //o的这个引用指向对线的类型:HashMap$NOde
            //但是这里我们将O强转Map.Entry的时候,还不报错

            //HashMap$是map,Entry的实现类
            //一个Entry的实现类对象,就表示一个键值对
            //可以使用这个对象,获得key和value.
            Map.Entry entry = (Map.Entry) o1;

            System.out.println("key的值为:"+entry.getKey()+"---------- value的值为:"+entry.getValue());
            System.out.println(o1.getClass().getName());
        }
    }

    private static void iterate(Map map) {
        //迭代器:Iterator
        System.out.println("开始使用迭代器遍历集合");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            //如果有下一个.则返回true,进入到while循环
            //获得对象.是Object,只能使用父类的方法
            //无法使用子类独有的方法
            Object next = iterator.next();

            //所以要把next强转为子类
            Map.Entry entry = (Map.Entry) next;
            System.out.println("key为:"+entry.getKey()+"---value为:"+entry.getValue());


        }
    }
}






