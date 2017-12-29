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
	//这个类可以帮助我们将毫秒的
	//转换成我们能看懂的字符串
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String time = df.format(l);
	System.out.println(time);

	System.out.println(date);
	System.out.println(new CalendarDome());
}

//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return "我调用了这个类的toString方法";
//}

}
