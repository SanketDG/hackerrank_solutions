import java.util.*;

public class The_Love_Letter_Mystery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0){
            String a = sc.next();
            int c = 0;

            for (int i = 0; i<(a.length()/2);i++){
                c += Math.abs((int) a.charAt(i) - (int) a.charAt(a.length()-i-1));
            }
            System.out.println(c);
            T--;
        }
        sc.close();
    }
}