import java.util.Scanner;

public class Reverse_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str = sc.nextLine();
        System.out.println("Input word: "+ str);
        System.out.print("Reverse string: ");
        for (int i = str.length()-1; i >= 0;i--){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
