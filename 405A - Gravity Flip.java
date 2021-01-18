    import java.io.*;
    import java.util.*;
    public class Sol {
        public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int n = Integer.parseInt(br.readLine());
           String input = br.readLine();
           String [] s = input.trim().split("\\s+");
           int a[] = new int[s.length];
           for (int i = 0; i < s.length; i++){
               a[i] = Integer.parseInt(s[i]);
           }
           Arrays.sort(a);
           for (int k = 0; k < a.length;k++)
               System.out.print(a[k] + " ");   
           }
    }
