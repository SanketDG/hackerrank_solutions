import java.util.*;
 
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
         
        for(int i=0;i<T;i++){
            int n = in.nextInt();
            int count = 0;
            int num = n;
            while(n>0)
            {
            	int rem = n % 10;
            	if (rem != 0 && num%rem == 0)
            		count++;
            	n/=10;
            }
            System.out.println(count);
        }
        in.close();
    }
}