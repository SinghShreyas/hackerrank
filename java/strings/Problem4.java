import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch[] = A.toCharArray();
        char ch1[]=new char[A.length()];
       
        int j = A.length();
        int count=0;

        for(int i=0; i<A.length(); i++,j--){
        	ch1[i] = ch[j-1];
        	if(ch1[i]==ch[i]){
        	count++;
        	}
        }
        
        if(count==A.length()){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
        
        
    }
}
