import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dome1 {
    public static void main(String[] args) {
        Map map  =  new HashMap();
        map.put("name","李想");
        map.put("gander","nan");
        map.put("age","21");
        for (Object o : map.keySet()
             ) {
            System.out.println("key的值为"+o+"value的值为:"+map.get(o).toString());

            Set set = map.entrySet();
            for (Object o1: set
                 ) {
                Map.Entry entry = (Map.Entry)o1;
                System.out.println("Key的值为:"+entry.getKey()+"      value的值为:"+entry.getValue());

            }

            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Object next = iterator.next();
                Map.Entry entry = (Map.Entry)next;
                System.out.println("Key的值为:"+entry.getKey()+"          value的值为:"+entry.getValue());
            }

            for (Object o2:map.values()
                 ) {
                System.out.println("value的值为:"+o2);
            }
        }
    }
}
