import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b=0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<a.length; i++){
			System.out.println("第"+i+"名的成绩是:");
			a[i]=input.nextInt();
			
			if(a[i]>b){
				b=a[i];
			}
			
		}
		System.out.println("五名学生的成绩最高值为:"+b);
	}

}
