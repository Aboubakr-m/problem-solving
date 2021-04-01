import java.util.Scanner;
public class sol {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int w = in.nextInt();
        double max;
        if (y >= w)
            max = y;
        else
            max = w;
        max--;
        double prob = (6.0 - max) / 6.0;
        double tolerance = 1.0E-6;
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = prob;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(prob-h1/k1) > prob*tolerance);
        System.out.println((int)h1+"/"+(int)k1);
    }
}
