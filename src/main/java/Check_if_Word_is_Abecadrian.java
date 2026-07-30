import java.util.Scanner;

public class Check_if_Word_is_Abecadrian {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

boolean abedario = true;
String  str ;
        System.out.println("Enter the string:");
        str= sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)>str.charAt(i+1)) {
          abedario = false;
          break;
            }
        }
        System.out.println(abedario);
        sc.close();
    }
}
