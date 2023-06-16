import java.util.*;
public class Day3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();            
       if(n%2==1)
       {
           System.out.println("Weird");
       }
       else if(n>2 && n<=5)
       {
           System.out.println("Not Weird");
       }
       else if(n>5 && n<=20)
       {
           System.out.println("Weird");
       }
       else
       {
           System.out.println("Not Weird");
       }
    }
}