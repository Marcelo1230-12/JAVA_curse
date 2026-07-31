import java.util.HashMap;
import java.util.Scanner;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "enter the string: ");
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);                           // this loop make the values and how many of these exists
        map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int j=0;j<str.length();j++){
            char ch=str.charAt(j);
            if(map.containsKey(ch)){// this loop check if the the characet itself repets .
                if(map.get(ch)==1){
                    System.out.println(j);
                }
            }
        }
sc.close();
    }
}
