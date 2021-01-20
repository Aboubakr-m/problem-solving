import java.util.Scanner;
public class Sol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5;j++){
                if(in.nextInt() == 1){
                    System.out.println((Math.abs(i-3) + Math.abs(j-3)));   
                    break;
                }    
            }
        }
    }
}
