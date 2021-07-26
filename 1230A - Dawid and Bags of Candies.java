import java.io.*;
import java.util.Arrays;
public class sol {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String inputInt[]= input.trim().split("\\s+");
        int data[] = new int[inputInt.length];
        for (int i=0; i<inputInt.length; i++){
            data[i] = Integer.parseInt(inputInt[i]);
        }
        Arrays.sort(data);
        if(data[3] == data[0] + data[1] + data[2] || data[3] + data[0] == data[1] + data[2])
            System.out.println("YES");
        else
            System.out.println("NO");
   }
}
