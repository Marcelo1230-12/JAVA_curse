import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Compression_with_Repeated_Counts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
       // int [] count = new int[26];
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }

        sc.close();
    }
}

