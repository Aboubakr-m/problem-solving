    import java.util.Scanner;
    public class sol {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a[] = new int[n*2];
            int b[] = new int[n];
            int c[] = new int[n];
            int games = 0;
            for (int i = 0; i < n*2; i++){
                a[i] = in.nextInt();
            }
            int x = 0, y = 0;
            for (int i = 0; i < a.length; i++){
                if (i % 2 == 0){
                    b[x] = a[i];
                    x++;
                }
                else {
                    c[y] = a[i];
                    y++;
                }
            }
            for (int i = 0; i < b.length; i++){
                for (int j = 0; j < c.length; j++){
                    if (b[i] == c[j])
                        games++;
                }
            }
            System.out.println(games);
        }
    }
