import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
//		将输入进来的数值,作为循环判断的条件
		for(int i = 0; i<=sum;i++){
			//System.out.println(i+"+"+(sum-i)+"="+sum);
		}
		for(int i = 0,j=sum;i<=sum;i++,j--){
			//System.out.println(i+"*"+j+"="+sum);
		}
		for(int i=0; i<0;i++){
			//循环接收成绩
			int score = input.nextInt();
			//做一个判断是否为负数
			if(score<0){
				System.out.println("不好意思,你走");
				break;
				
			}	
		}
		int people = 0;
		for(int i = 0;i<10;i++){
			/*
			 * 循环成绩
			 * 如果大于80分,则计入人数people中
			 */
			int score = input.nextInt();
			if(score<80){
				System.out.println("成绩太低,不好意思");
				continue;
			}
			people++;
		}
		System.out.println("八十分以上的人有"+people);
	}

}
