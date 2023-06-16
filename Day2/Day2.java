import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); 
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();     
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double total = mealCost + tip + tax;
        int totalCost = (int) Math.round(total);
        System.out.println(totalCost );
    }
}