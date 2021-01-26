import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());  
       String line = br.readLine();
       String strs[] = line.trim().split("\\s+");
       int a[] = new int[strs.length];
       for (int i = 0; i < strs.length; i++){
           a[i] = Integer.parseInt(strs[i]);
       }
       //.........................................
       int untreated = 0, free = 0;
       for (int i = 0; i < a.length; i++){
           if (a[i] > 0){
                free += a[i];
           }
           else{
               if (free > 0)
                   free--;
               else 
                   untreated++;
           }        
       }
       System.out.println(untreated);
    }
}
