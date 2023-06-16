import java.io.*;
import java.util.*;
public class Day1 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s.concat(s1));
    }
}