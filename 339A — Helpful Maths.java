import java.io.*;
import java.util.Arrays;
public class sol {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String newStr = "";
        String number[] = s.split("\\+");
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            newStr += number[i] + "+";
        }
        System.out.println(newStr.substring(0, newStr.length()-1));
    }
}
