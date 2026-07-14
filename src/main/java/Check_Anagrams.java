import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagrams {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

String str1 ;
String str2;
        System.out.print("Enter the first string: ");
        str1= sc.nextLine();
        System.out.print("Enter the second string: ");
        str2= sc.nextLine();
        char ctr[] =  str1.toCharArray();
        char ctr2[]= str2.toCharArray();
        Arrays.sort(ctr);
        Arrays.sort(ctr2);
        System.out.println(Arrays.equals(ctr,ctr2));

        sc.close();
    }
}
