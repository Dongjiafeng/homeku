import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * ���ĸ��༶,ÿ���༶��5��ͬѧ
		 * ����һ��ÿ���༶��Ҫѭ��һ��
		 * ������༶��ѭ����
		 * 	��ѭ������ÿ��ͬѧ�ĳɼ�					
		 */
		//��һ��ѭ��,ÿ��ѭ������ʾһ���༶
		for(int i = 1; i<5;i++){
			//�ڶ���ѭ��,ÿ��ѭ������ʾҪ
			//�����и�ѧ���ĳɼ�
			int classScore = 0;
			for(int j =1; j<6;j++){
				//������ѭ����ִ�����ʱ
				//���������ۻ����˶��ٴ�
				System.out.println("�������"+i+"��ĵ�"+j+"λͬѧ�ĳɼ�:");
				int score = input.nextInt();
//				��ô�ܰ�����������,������༶��ƽ����?
				classScore+=score;
			}
			System.out.println("��"+i+"���ƽ������:"+(classScore/5));
		}
	}

}
