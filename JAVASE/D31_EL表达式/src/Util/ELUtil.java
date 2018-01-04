package Util;

public class ELUtil {
    /**
     * 1.必须是静态方法
     * 2.方法必须有返回值
     * @param input
     * @return
     */
    public static String reverse(String input){

        return  "SUCCESS";
    }
    public  static  String inversion(String input){
        int length = input.length();
        String num = "";
        for (int i = 0; i <length ; i++) {
            num=input.charAt(i)+num;
        }

        return num;
    }
}
