import java.io.*;
import java.util.*;
public class Sol {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       HashMap<Integer, Integer> map = new HashMap<>();
       String line = br.readLine();
       String line2 = br.readLine();
       String s[] = line.trim().split("\\s+");
       String s2[] = line2.trim().split("");
       int a[] = new int[s.length];
       int b[] = new int[s2.length];
       int count = 1, calories = 0;
       
       for (int i = 0; i < s.length; i++){
           a[i] = Integer.parseInt(s[i]);
           map.put(count, a[i]);
           count++;
       }
       for (int i = 0; i < s2.length; i++){
           b[i] = Integer.parseInt(s2[i]);
       }
       for (int i = 0; i < line2.length(); i++){  
           calories += map.get(b[i]);
       }
       System.out.println(calories);
    }
}
