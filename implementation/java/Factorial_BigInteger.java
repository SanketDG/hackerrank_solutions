import java.util.Scanner;
import java.math.BigInteger;

public class Factorial_BigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static String factorial(int n) {

        BigInteger f = new BigInteger("1");
        for(int i = 2; i <=n; i++) {
            f = f.multiply(new BigInteger(i + ""));
        }
        return f.toString();
    }
}