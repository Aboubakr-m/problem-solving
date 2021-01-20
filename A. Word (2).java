        import java.io.*;
        public class Sol {
            public static void main(String[] args) throws IOException{
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               String s = br.readLine();
               int u = 0;
               int l =0;
               int a[] = new int[s.length()];
               for (int i = 0;i < s.length();i++){
                   a[i] = s.charAt(i);
               }
               for (int i = 0;i < a.length;i++){
                   if(a[i] >= 65 && a[i] <= 90)
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
