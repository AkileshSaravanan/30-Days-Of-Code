import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int temp=0;
        int swapCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapCount++;   
                }
                
            }
            if(swapCount==0){
                break;
            }
        }
                System.out.println("Array is sorted in "+swapCount+" swaps.");
                System.out.println("First Element: "+arr[0]);
                System.out.println("Last Element: "+arr[arr.length-1]);
            
        }
    }