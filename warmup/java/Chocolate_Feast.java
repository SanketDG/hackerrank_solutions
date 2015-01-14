import java.util.*;

public class Chocolate_Feast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int N, int C, int M){
        int numberOfChocolates = N/C;

        int nc1 = numberOfChocolates;
        int result = 0;

        while (nc1/M > 0)
            {
                result += nc1 / M;
                nc1 = (nc1 / M) + (nc1 % M);
            }
        return numberOfChocolates + result;

    }


}
