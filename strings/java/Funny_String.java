import java.util.*;

class Funny_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for(int j = 0; j < T; j++) {

            int flag = 0;

            String s = sc.next();

            String reverse = new StringBuilder(s).reverse().toString();
            for(int i = 1; i < s.length() - 1; i++)
            {
                int s_count = Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
                int rev_count = Math.abs((int)reverse.charAt(i) - (int)reverse.charAt(i-1));
                if (s_count != rev_count) {
                    System.out.println("Not Funny");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Funny");
            }
        }
    }
}
