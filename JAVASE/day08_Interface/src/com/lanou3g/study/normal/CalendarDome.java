package com.lanou3g.study.normal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class CalendarDome {
public static void main(String[] args) {
	Date date = new Date();
//	System.out.println(System.currentTimeMillis());
	long l = System.currentTimeMillis();
	//�������԰������ǽ������
	//ת���������ܿ������ַ���
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String time = df.format(l);
	System.out.println(time);

	System.out.println(date);
	System.out.println(new CalendarDome());
}

//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return "�ҵ�����������toString����";
//}

}
