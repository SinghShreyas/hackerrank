import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        char ch[] = A.toCharArray();
        char ch1[] = B.toCharArray();

        if(ch[0]>ch1[0]){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }

        String s = A.substring(0,1);
        String s1 = B.substring(0,1);
        String x = s.toUpperCase();
        String x1 = s1.toUpperCase();
      
      	String k = A.substring(1,A.length());
      	String k1 = B.substring(1,B.length());

      	String result = x+k+" "+x1+k1;

        System.out.println(result);
    }
}
