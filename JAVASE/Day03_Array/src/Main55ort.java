import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main55ort {
	public static void main(String[] args){
		/*
		 * 创建一个数组,用来接收成绩
		 * 要接受5个人的成绩,所以长度为5
		 */
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5];
		for(int i =0; i<scores.length;i++){
			System.out.println("第"+i+"名的成绩是:");
			
			scores[i]= input.nextInt();
		}
//		对数组进行排序,固定写法
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
