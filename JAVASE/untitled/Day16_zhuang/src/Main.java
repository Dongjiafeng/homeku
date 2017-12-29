import componet.可乐componet;
import decorator.兑水decorator;
import decorator.加醋decorator;

public class Main {

    public static void main(String[] args) {
        可乐componet 可乐 = new 可乐componet() ;

        //兑水
        兑水decorator 兑水 = new 兑水decorator(可乐);

        System.out.println(兑水.getName()+"---"+兑水.price());

        加醋decorator 加醋   = new 加醋decorator(兑水);

        System.out.println(加醋.getName()+"----"+加醋.price());


    }
}
