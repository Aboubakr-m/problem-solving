    import java.io.*;
    public class Sol {
        public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int n = Integer.parseInt(br.readLine());  
           String line = br.readLine();
           int ans = 0;
           for (int i = 0 ; i < line.length()-1 ; i++){
               if (line.charAt(i) == line.charAt(i + 1))
                   ans++;
           }
           System.out.println(ans);
        }
    }
