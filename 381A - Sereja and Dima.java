import java.io.*;
public class Sol {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());  
       String lines = br.readLine();
       String[] str = lines.trim().split("\\s+");
       int a[] = new int[str.length];
       for (int j=0;j <str.length;j++)
           a[j] = Integer.parseInt(str[j]);
       //..................................................
        int s = 0, d = 0, min_indx = 0, max_indx = n-1; 
        if (n % 2 != 0){
            while (max_indx >= min_indx){
                if (a[max_indx] > a[min_indx]){
                    s += a[max_indx--];
                }
                else {
                    if (max_indx == min_indx){
                        s += a[min_indx++];
                        break;
                    }
                    s += a[min_indx++];
                }
                if (a[max_indx] > a[min_indx]){
                    d += a[max_indx--];
                }
                else{
                    if (max_indx == min_indx){
                        s += a[min_indx++];
                        break;
                    }
                    d += a[min_indx++];
                }
            }   
        }
        else {
            while (max_indx >= min_indx){
                if (a[max_indx] > a[min_indx]){
                    s += a[max_indx--];
                }
                else {
                    s += a[min_indx++];
                }
                if (a[max_indx] > a[min_indx]){
                    d += a[max_indx--];
                }
                else{
                    d += a[min_indx++];
                }
            }
        }
        System.out.println(s + " " + d);
    }
}
