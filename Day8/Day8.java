import java.util.*;
import java.io.*;
class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> Contact =new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Contact.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(Contact.containsKey(s)){
                System.out.println(s+"="+Contact.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}