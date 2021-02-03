import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String line[] = input.trim().split("\\s+");
        int price = Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);
        for (int i = 1; i < 10 ; i++){
            if ((price * i) % 10 == 0 || (price * i) % 10 == r){
                System.out.println(i);
                break;
            }
        }
    } 
}
