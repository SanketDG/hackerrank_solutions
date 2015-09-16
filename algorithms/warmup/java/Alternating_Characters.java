import java.util.*;

public class Alternating_Characters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();


        while(r>0){
            String a = sc.next();
            int c = 0;
            for (int i=0; i<a.length()-1; i++)
                if (a.charAt(i) == a.charAt(i+1))
                    c++;
            System.out.println(c);
            r--;
        }
    sc.close();
    }
}