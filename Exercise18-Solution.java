import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char aTemp[] = a.toCharArray();
        char bTemp[] = b.toCharArray();
        java.util.Arrays.sort(aTemp);
        java.util.Arrays.sort(bTemp);
        
        return java.util.Arrays.equals(aTemp, bTemp);
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}