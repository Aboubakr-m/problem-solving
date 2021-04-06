import java.io.*;
public class sol {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() > 10)
                a[i] = "" + word.charAt(0) + (word.length() -2) + word.charAt(word.length() - 1);
            else { a[i] = word; }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
