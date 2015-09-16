import java.util.*;

class Filling_Jars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);

        long sum = 0;

        for (int i=0;i<m;i++){

            String[] s1 = sc.nextLine().split(" ");
            long a = Long.parseLong(s1[0]);
            long b = Long.parseLong(s1[1]);
            long k = Long.parseLong(s1[2]);

            sum += ((b - a + 1) * k);
        }
        System.out.println(sum/n);
    }
}