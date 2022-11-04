import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);    
      ArrayList<Integer> list = new ArrayList<>();
      
      int n = scan.nextInt();
      
      for(int i = 0; i < n;  i++) {
          int x = scan.nextInt();
          list.add(x);    
      }
      
      n = scan.nextInt();
      
      for(int i = 0; i < n; i++) {
          
          scan.nextLine();
          String r = scan.nextLine();
          
          if(r.equals("Insert")) {
              int x = scan.nextInt();
              int y = scan.nextInt();
              list.add(x, y);
          } else if(r.equals("Delete")) {
              int x = scan.nextInt();
              list.remove(x);
          }
          
      }
      
      for(int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i) + " ");
      }
      
    }
}
