import java.io.*;
import java.util.*;

public class Is_Fibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long n;

        for(int m=1; m<=T; m++) {
            n = sc.nextLong();

            long fibformula = (5 * Math.pow(n, 2)) + 4;
            long fibFormula2 = (5 * Math.pow(n, 2)) - 4;

            if (isPerfectSquare(fibformula) || isPerfectSquare(fibFormula2)) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }
    }

    public static boolean isPerfectSquare(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}