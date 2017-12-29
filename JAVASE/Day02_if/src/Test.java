import javax.print.attribute.SetOfIntegerSyntax;

public class Test {
   public static void main(String[] args){
    	  int ranking = 7;
    	  if(ranking==1){
    		  System.out.println("参加麻省理工大学组织的一个月夏令营");
    	  }else if(ranking==2){
    		  System.out.println("获得惠普笔记本电脑一部");
    	  }else if(ranking==3){
    		  System.out.println("获得移动硬盘一个");
    	  }else{
    		  System.out.println("趁早滚");
    	  }
    	  int n =4;
	switch(n){
	case 2:
//		如果switch后面的括号中的内容
//		等于2的话,那么执行下面的语句
		System.out.println("没错,是2");
		break;
	case 3:
		System.out.println("没错.是3");
		break;
	default:
		System.out.println("我是默认值");
	break;
	}
	int rink = 1;
	switch(rink){
	case 1:
		System.out.println("参加麻省理工大学组织的一个月夏令营");
		break;
	case 2:
		System.out.println("获得惠普笔记本电脑一部");
		break;
	case 3 :
		System.out.println("获得移动硬盘一个");
		break;
	case 4:
		System.out.println("不好意思");
		break;
	}
		char ch = 'a';
		switch(ch){
		case 'a':
			break;
		case 'b':
			break;
		}
		
 }
}
