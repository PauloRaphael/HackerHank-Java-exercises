import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] sub = new String[s.length() - k + 1];
        
        for (int i = 0; i <= s.length() - k; i++) {
                
                sub[i] =   s.substring(i, i + k);              
            
        }
        
        //Lexicographical Order function below =
        
        for (int j = 0; j < sub.length - 1; j++) {
            for (int o = j + 1; o < sub.length ; o++) {
                
                if(sub[j].compareTo(sub[o]) > 0) {
                
                String temp = sub[j];
                sub[j] = sub[o];
                sub[o] = temp;                
                }
                
            }
            
        }
        
        smallest = sub[0];
        largest = sub[sub.length - 1];
        
        return smallest + "\n" + largest;
    }

