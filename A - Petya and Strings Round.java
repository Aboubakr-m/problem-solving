import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s1 = br.readLine();
       String s2 = br.readLine();
       if (s1.compareToIgnoreCase(s2) < 0)
           System.out.println("-1");
       else if (s1.compareToIgnoreCase(s2) > 0)
           System.out.println("1");
       else 
           System.out.println("0");
       }
}
