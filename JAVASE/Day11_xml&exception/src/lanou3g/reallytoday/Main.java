package lanou3g.reallytoday;

import lanou3g.reallytoday.exception.EatException;
import lanou3g.reallytoday.exception.NotEnoughException;
import lanou3g.reallytoday.exception.TooMuchException;

public class Main {
    public static void main(String[] args) {
        //showSimple();

        //自定义异常
        //showSecond();
        ChunLai chunLai = null;
        try {
            chunLai = new ChunLai();
            chunLai.eat(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                chunLai.eat(230);

            } catch (EatException e1) {
                e1.printStackTrace();
            }

        }
    }
}

//    private static void showSecond() {
//        try {
//            new ChunLai().eat(230);
//        } catch (NotEnoughException e) {
//            try {
//                new ChunLai().eat(230);
//            } catch (NotEnoughException e1) {
//                e1.printStackTrace();
//            } catch (TooMuchException e1) {
//                e1.printStackTrace();
//            }
//        } catch (TooMuchException e) {
//            e.printStackTrace();
//        }
//   }

//    private static void showSimple() {
//        int n = 10;
//        try {
//            /*
//            在try中.写可能会出现异常的代码
//            如果执行该代码时,出现异常
//            则程序会跳转到.catch快中
//             */
//            int result = n / 0;
//
//        }catch (EatException e){
//            System.out.println(e.getClass().getName());
//            System.out.println(e.getClass().getSimpleName());
//            //方法执行到return的时候
//            //就好返回一个值
//            //这里的返回值类型为void
//            //表示没有返回值,所以直接写了一个return就行了
//            return;
//        }finally {
//            //在finally中,是一定会执行的代码
//            //就是不管是报错了.还是没报错
//            //都会执行
//            System.out.println("吼吼吼吼吼吼");
//        }
//    }
//}
