import java.util.Arrays;

public class Buddder {
    public static void main(String[] args) {
        int array[] = {2,3,4,6,1,4};
        for(int i = 0 ; i<array.length-1;i++){
            for (int j= 0; j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int c = array[j+1];
                    array[j+1] = array[j];
                    array[j] = c;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
