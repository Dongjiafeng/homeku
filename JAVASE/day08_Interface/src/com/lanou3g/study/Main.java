package com.lanou3g.study;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        	//���������,ָ��������Ķ���
        	//���Ƕ�̬��һ����
        	
        	Person person = new Teacher();
        	Person p2 = new Doctor();
        	
        	
			Scanner input = new Scanner(System.in);
			System.out.println("����1.��ʦ�ɻ�            ����2.ҽ���ɻ�     ����3.ѧ���ɻ�");
			
			//��ȡ����̨���������ֵ
			//��� ������������
			//��ִ���������ʱ,�������̨
			//һֱ����������,�����ͻῨ������
			int choice = input.nextInt();
			
		Company2 company2 = new Company2();	
		if(choice ==  1){
			Teacher t = new Teacher();
			company2.setPerson(t);
			
		}else if(choice == 2){
			Doctor doc =new Doctor();
			company2.setPerson(doc);
		}else if(choice == 3){
			Student stu = new Student();
			company2.setPerson(stu);
		}
		company2.work();
			
		}
}
