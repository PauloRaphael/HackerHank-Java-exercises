import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim();
        
        String temp = s.replaceAll("[^a-zA-Z0-9]", " ");
        
        String[] a = temp.split("\\s+");
        
        int size = (s.isEmpty()? 0 : a.length);  
           
        System.out.println(size);
         
        for (int i = 0; i < a.length; i++) {
            
            System.out.println(a[i]);
            
        }
        scan.close();
    }
}

