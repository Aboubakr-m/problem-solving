import java.io.*;
import java.lang.Math;
public class sol {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String str[] = line.trim().split("\\s+");
        int a[] = new int[str.length];
        for (int i = 0; i <str.length; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        int n = a[0];
        double t = a[1], k = a[2];
        int d = a[3];
        double time1 = Math.ceil(n / k) * t;
        double time2 = t + d;
        if (time2 < time1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
