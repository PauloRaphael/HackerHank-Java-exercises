import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
    
    void add(int ... args) {
         int sum = 0;
         ArrayList<Integer> numbers = new ArrayList();
         for (int x: args) {
             numbers.add(x);
             sum += x;
         }
         int x = 1;
         while(x < numbers.size()) {
             System.out.print(numbers.get(x - 1) + "+");
             x++;
         }
         System.out.print(numbers.get(numbers.size() - 1));
         
         System.out.print("=" + sum);
         
         System.out.println();
        
         
     }
    
}

