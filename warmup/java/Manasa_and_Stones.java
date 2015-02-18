import java.util.*;

public class Manasa_and_Stones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0) {
            int n = sc.nextInt();
            n = n - 1;
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a = Math.min(a1, b1);
            int b = Math.max(a1, b1);

            int current = a * n;
            int maximum = b * n;
            int diff = b - a;

            if (a==b)
                System.out.println(current);
            else{
                String al = "";
                while (current <= maximum) {
                    al+=(int)current + " ";
                    current += diff;
                }
                    System.out.println(al);
            }
            T--;
        }
        sc.close();
    }
}