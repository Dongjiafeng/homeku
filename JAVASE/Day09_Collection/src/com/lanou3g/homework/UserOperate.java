package com.lanou3g.homework;

import com.lanou3g.homework.exception.*;
import com.lanou3g.homework.util.PasswordCheckTool;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by zyf on 2017/12/5.
 */
public class UserOperate {
          static SAXReader reader = new SAXReader();
          static Document document = null;


	public static Person login (
			String username,
			String password) throws LoginException{

		Person person = UserData.userMap.get(username);
		if(person == null){
			throw new UsernameNotExistsException();
		}

		if(!person.getPassword().equals(password)){
			//说明密码不正确，抛异常
			throw new PasswordNotMatchedException();
		}

		//如果密码正确写在这
		return person;





	}

	public static void register(Person person) throws RegisterException{




		//listRegister(person);

		Person p =
			UserData.userMap.get(person.getUsername());

		if(p != null){
			throw new UsernameExistsException();
		}

		if(PasswordCheckTool.isNotEasy(person.getPassword())){
			UserData.userMap.put(person.getUsername(),person);
		}





	}

	private static void listRegister(Person person) throws UsernameExistsException {
		for(Person p : UserData.users){
			if(p.equals(person)){
				//说明，在users集合中，存在一个p
				//它的用户名与参数person相同
				//抛出一个用户名已存在异常
				throw new UsernameExistsException();
			}
		}
		UserData.users.add(person);
	}

}