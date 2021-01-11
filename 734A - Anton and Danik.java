    import java.util.*;
    public class AntonAndDanik {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String s = in.next();
            int countA = 0;
            int countD = 0;
            for (int i = 0;i < s.length(); i++){
                if(s.charAt(i) == 'A')
                    countA++;
                else if (s.charAt(i) == 'D')
                    countD++;
            }
            if (countA > countD)
                System.out.println("Anton");
            else if (countD > countA)
                System.out.println("Danik");
            else 
                System.out.println("Friendship");
        }
    }
