package Demo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Login extends UserData{
	 UserInter userinter ;
      public UserInter show(String yo1,String mi1){
    	  
    	  for(int i=0 ;i<user.length;i++){
    		  for(int j =0;j<user[i].length;j++){
    			  if(user[i][1].equals(yo1)&&user[i][2].equals(mi1)){
    				  System.out.println("恭喜登陆成功");
    				  System.out.println("你的用户名为:"+user[i][0]+"你的职业为:"+user[i][3]);
    				  long l = System.currentTimeMillis();
    				  DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    					String time = df.format(l);
    					System.out.println(time);
    					if(user[i][2].equals("Worker")){
    						userinter = new Worker();
    					}else if(user[i][2].equals("Doctor")){
    						userinter = new Doctor();
    					}else if(user[i][2].equals("Cooker")){
    						userinter = new Cooker();
    					}else if(user[i][2].equals("Boss")){
    						userinter = new Boss();
    					}
    					return userinter;
    					
    				  }
    					  
    					  
    			  }
    			  
    			  
    		  }
    	  System.out.println("你输入的有误.");
    	  return null;  
    	  }
      }

