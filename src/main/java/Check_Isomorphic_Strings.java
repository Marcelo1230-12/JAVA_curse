import java.util.HashMap;
import java.util.Scanner;

public class Check_Isomorphic_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first string:");
        String s1=sc.nextLine();
        System.out.print("Enter the second string:");
        String s2=sc.nextLine();
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
boolean value = true;
        for(int j=0;j<s1.length();j++){
        if(map.containsKey(s1.charAt(j))){
            if(map.get(s1.charAt(j))!=s2.charAt(j)){
value= false;
break;
            }
        }
        else {
            map.put(s1.charAt(j),s2.charAt(j));

        }
        }
        if(value) {
            for (int j = 0; j < s1.length(); j++) {
                if (map2.containsKey(s2.charAt(j))) {
                    if (map2.get(s2.charAt(j)) != s1.charAt(j)) {
                        value = false;
                        break;
                    }
                } else {
                    map2.put(s2.charAt(j), s1.charAt(j));

                }
            }

        }

        System.out.println(value);
    }
    }

