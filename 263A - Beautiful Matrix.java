import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int moves = 0;
        int l = 4;
        for (int n = 4; n >= 0 ; n--){
            String lines = br.readLine();
            String[] s = lines.trim().split("\\s+");
            int arr[] = new int[s.length];
            for (int j = 0; j < s.length;j++){
                arr[j] = Integer.parseInt(s[j]);                    
            }
            if (n == 1)
                l = 3;
            if (n == 0)
                l = 4;
            if(arr[0] == 1)
                moves = l;
            if(arr[1] == 1)
                moves = l-1;
            if(arr[2] == 1)
                moves = l-2;
            if(arr[3] == 1)
                moves = l-1;
            if(arr[4] == 1)
                moves = l;  
            l--;
        }
        System.out.println(moves);      
    }
}
