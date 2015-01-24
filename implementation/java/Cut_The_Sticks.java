import java.util.*;

public class Cut_The_Sticks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lengths[] = new int[n];
        List<Integer> output = new LinkedList<Integer>();

        for (int i = 0; i < n; i++)
            lengths[i] = sc.nextInt();

        sc.close();
        Arrays.sort(lengths);

        for (int i = 0; i < n; i++) {
            if (lengths[i] == 0)
                continue;
            else {
                output.add(n - i);
                final int  v = lengths[i];
                for (int j = i; j < n; j++) {    // This loop isn't working like it should
                    lengths[j] -= lengths[i];
                 // System.out.print(lengths[j] + " ");  // For debugging purposes
                }
             // System.out.println("");
            }
        }

        for (int i = 0; i < output.size(); i++)
            System.out.println(output.get(i));
    }
}