import java.util.*;
public class sol {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int a, width = 0;
        for (int i = 0;i < n;i++){
            a = in.nextInt();
            if (a > h){
                width += 2;
            }
            else{
                width++;
            }
        }
        System.out.println(width);
    }
}
