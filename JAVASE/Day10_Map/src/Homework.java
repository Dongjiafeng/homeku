import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {


        Map map = new HashMap();

        map.put("张三","name");
        map.put("张1","name2");
        map.put("张2","name3");
        map.put("张3","name4");
        for (Object o: map.keySet()
             ) {
            System.out.println(map.get(o).toString());
        }
        Set set = map.entrySet();
        for (Object o1: set
             ) {
            Map.Entry entry = (Map.Entry)o1;
            System.out.println(entry.getKey()+"-------------"+entry.getValue());

        }

           Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Object next =iterator.next();
            Map.Entry entry = (Map.Entry)next;
            System.out.println(entry.getKey()+"-------------"+entry.getValue());
        }
        }
    }
