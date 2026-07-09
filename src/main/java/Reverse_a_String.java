import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the reverse string: ");
        str = sc.nextLine();
            for (int i = str.length()-1; i >= 0;i--){
                System.out.print(str.charAt(i));
            }
        sc.close();
    }
}
