import java.io.*;
import java.util.*;
public class sol {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> data = new HashSet<>();
        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) > 96 && line.charAt(i) < 123)
                data.add(line.charAt(i));
        }
        System.out.println(data.size());
    }
}
