package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Login extends UserData  {
	 UserInter uderinter;
	
	public UserInter show(String yo1, String mi1){
	   for(int i = 0; i<user.length;i++){
		  
		  if(user[i][1].equals(yo1)&&user[i][2].equals(mi1)){
			   System.out.println("登录成功");
			   System.out.println("用户 "+user[i][0]+"职业 "+user[i][3]);
			   long l = System.currentTimeMillis();
			   DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String time = df.format(l);
				System.out.println(time);
				if(user[i][3].equals("Worker")){
				 uderinter = new Worker(); 
				}else if(user[i][3].equals("Doctor")){
					 uderinter = new Doctor(); 
					}else if(user[i][3].equals("Cooker")){
						uderinter = new Cooker(); 
					}else if(user[i][3].equals("Boss")){
						 uderinter = new Boss(); 
					}
				
				return uderinter;
		   }
			  
		   
			  
	   }
	   System.out.println("你的输入错误.");  	
	   return null;
	}
	
	
			   	
		
		}

