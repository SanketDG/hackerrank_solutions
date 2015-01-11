import java.util.*;

public class Utopian_Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        while(T>0){
            int n = sc.nextInt();
            int height = 1;

            for(int i = 1; i<=n; i++){
                if (i % 2 != 0)
                    height *= 2;
                else
                    height += 1;
            }
            System.out.println(height);
        T--;
        }
    }
}