import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b=0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<a.length; i++){
			System.out.println("��"+i+"���ĳɼ���:");
			a[i]=input.nextInt();
			
			if(a[i]>b){
				b=a[i];
			}
			
		}
		System.out.println("����ѧ���ĳɼ����ֵΪ:"+b);
	}

}
