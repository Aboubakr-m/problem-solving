        import java.io.*;
        public class Sol {
            public static void main(String[] args) throws IOException{
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               String line = br.readLine();
               line = 'a' + line;
               int ans = 0, move;
               for (int i = 0; i < line.length() - 1; i++){
                   move = Math.abs(line.charAt(i) - line.charAt(i + 1));
                   ans += Math.min(move, 26 - move);
               }
               System.out.println(ans);
            }
        }
