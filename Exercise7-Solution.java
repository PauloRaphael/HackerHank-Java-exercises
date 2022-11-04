import java.util.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int repeat = 0;
            
            int result = a;
            
             while(repeat < n) {          
                
                result += Math.pow(2, repeat) * b;
                
                System.out.print(result + " ");
                
                repeat++;
             }
             
             System.out.println();
            
        }
        in.close();
    }
}
