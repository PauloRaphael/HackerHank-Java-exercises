import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reverse = "";
    
        for(int i = 0; i < A.length(); i++) {
            
            reverse += A.substring(A.length() - i - 1, A.length() - i);
            
        }
        
        if (reverse.equals(A)) {
            
            System.out.println("Yes");
           
        } else {
            
            System.out.println("No");
            
        }
        
    }
}



