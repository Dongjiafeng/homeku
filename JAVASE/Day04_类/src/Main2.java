import java.util.regex.Matcher;

public class Main2 {
public static void main(String[] args) {

	Father father = new Father();
	Mother mother = new Mother();
	Child child = new Child();
	//ʹ�ö���,�������ķ���ȥ��һЩ����
	//������.������();
	father.showInfo();
	mother.showInfo();
	child.showInfo();
	//������.����
	System.out.println(father.name);
	Student student = new Student();
	//������.������ = ����ֵ;
	//����һ����ֵ����
	student.name ="������";
	student.school = ("��Ÿ�Ƽ���ӭ��");
	System.out.println(student.name);
	//����play�������	
	student.play();
	student.������(100);
	//����������з���ֵ��
	//����ֵ������ΪString 
	//�ı���ȥ������������ķ���ֵ
	String f      = 	 student.hot("����");
	System.out.println(f);
}
}


