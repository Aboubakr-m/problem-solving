import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int i = 0;
        for (int j = 0; j < t.length(); j++){
            if (t.charAt(j) == s.charAt(i))
                i++;
        }
        System.out.println(i+1);
    } 
}
