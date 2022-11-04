import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        NumberFormat chinese = NumberFormat.getCurrencyInstance(java.util.Locale.CHINA);
        NumberFormat usa = NumberFormat.getCurrencyInstance(java.util.Locale.US);
        NumberFormat frances = NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
        
        String us = usa.format(payment);
        String china = chinese.format(payment);
        String france = frances.format(payment);
        
        NumberFormat indias = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols decimat = ((DecimalFormat) indias).getDecimalFormatSymbols();
        decimat.setCurrencySymbol("");
        ((DecimalFormat) indias).setDecimalFormatSymbols(decimat);
        String india = indias.format(payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: Rs."  + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
