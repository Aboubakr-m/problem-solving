    import java.io.*;
    public class Sol {
        public static void main(String[] args) throws IOException  {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());  
            int x = 0;
            for(int i = 0;i < n; i++){
                String lines = br.readLine();
                String[] str = lines.trim().split("\\s+");
                int arr[] = new int[str.length];
                for (int j=0;j <str.length;j++){
                    arr[j] = Integer.parseInt(str[j]);
                }
                if (arr[0] + arr[1] + arr[2] >= 2)
                    x++;
            }       
            System.out.println(x);
        }
    }
