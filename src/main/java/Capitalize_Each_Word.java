
import java.util.Scanner;

public class Capitalize_Each_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str;
        System.out.println("Enter the sentence:");
        str = sc.nextLine();

     String[] wordd =str.split( " ");
     String str1 ="";
     for (int i=0;i<wordd.length;i++){
         str1 = Character.toUpperCase(wordd[i].charAt(0)) + wordd[i].substring(1).toLowerCase();
         if(i<wordd.length-1){
             str1+=" ";
         }

     }
        System.out.println(str1);
        sc.close();
    }

}
