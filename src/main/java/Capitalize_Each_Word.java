
import java.util.Scanner;

public class Capitalize_Each_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str1 = sc.nextLine();

str1=str1.toUpperCase();
        System.out.println(str1);
        sc.close();
    }
}
