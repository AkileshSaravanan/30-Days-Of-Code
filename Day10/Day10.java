import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
