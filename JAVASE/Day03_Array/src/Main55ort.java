import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main55ort {
	public static void main(String[] args){
		/*
		 * ����һ������,�������ճɼ�
		 * Ҫ����5���˵ĳɼ�,���Գ���Ϊ5
		 */
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5];
		for(int i =0; i<scores.length;i++){
			System.out.println("��"+i+"���ĳɼ���:");
			
			scores[i]= input.nextInt();
		}
//		�������������,�̶�д��
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
