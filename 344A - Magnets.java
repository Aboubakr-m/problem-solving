import java.util.Scanner;
public class sol {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b = 0, ans = 0;
        for (int i = 0;i < n; i++){
            a = in.nextInt();
            if(a !=b)
                ans++;
            b = a;
        }
        System.out.println(ans);
    }
}
