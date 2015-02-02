import java.util.*;

class Sherlock_and_Squares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.round(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
            T--;
        }
        sc.close();
    }
}