import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Flipping_Bits {
 public static void main(String[] args) {
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc = new Scanner(System.in);
   int t;
   t = sc.nextInt();
   while((t--)>0){
     Long x = sc.nextLong();
     String ans="",anss="";
     String s = Long.toBinaryString(x);
     for(int i = 0,j = s.length()-1;i<32;i++){
       if(j>=0 && s.charAt(j) =='1'){
         ans = ans + "0";
     }
     else
     {
         ans = ans + "1";
     }
     {
         j--;
     }
 }
 for(int i = 31;i>=0;i--){
   anss = anss+ans.charAt(i);
}
String bin = anss;
long number = 0;
int dig;
for (int i = 0; i < bin.length(); i++){
 dig = bin.charAt(i) - '0';
 number = 2 * number + dig;
}
System.out.println( Long.toString(number));
}
}
}