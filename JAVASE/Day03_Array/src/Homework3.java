
public class Homework3 {
	public static void main(String[] args) {
		for(int i =0;i<11;i++){
			for(int j=0;j<11;j++){
				
				if(i==j||(i+j==10)||i==0||i==10||j==0||j==10){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
		System.out.println();
		
		}
		
	}

}
