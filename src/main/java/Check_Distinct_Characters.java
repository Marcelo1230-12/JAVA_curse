import java.util.Scanner;

public class Check_Distinct_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the sentence:");
        str = sc.nextLine();

          for (int i = 0; i < str.length(); i++) {
       if(str.charAt(i)==str.charAt(i+1)){
               System.out.println("True");
               break;
           }
           else{
               System.out.println("False");
               break;
           }
          }
            sc.close();

    }
}
