import java.util.ArrayList;
import java.util.List;

public class Study {

    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.size());
        list.add("张三");
        list.add(new Student());
        list.add(Integer.valueOf(1));
        System.out.println(list.size());

        for(int i = 0; i < list.size(); ++i) {
            Object obj = list.get(i);
            System.out.println("第" + i + "个元素为:" + obj.toString());
        }

        Integer a = Integer.valueOf(1);
        int b = a.intValue();
        Object obj = Integer.valueOf(1);
        System.out.println(obj.getClass().getName());
    }
}


