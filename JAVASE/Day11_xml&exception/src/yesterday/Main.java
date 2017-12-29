package yesterday;

import yesterday.one.DatabaseUtil;
import yesterday.one.Student;

public class Main {
    public static void main(String[] args) {
        DatabaseUtil<Student> abc = new DatabaseUtil<>();

        abc.save(new Student());
    }
    public static  <T> void test(T t){

    }
    public static <E> E test2(){
        return  null;

    }
}
