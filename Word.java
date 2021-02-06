import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       int u = 0;
       int l =0;
       for (int i = 0;i < s.length();i++){
           if(Character.isUpperCase(s.charAt(i)))
               u++;
           else
               l++;
       }
       if (u > l)
           System.out.println(s.toUpperCase());
       else 
           System.out.println(s.toLowerCase());
    }
}
