import java.util.Scanner;

public class Convert_to_Lowercases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the sentence:");
        str = sc.nextLine();

        System.out.println(str.toLowerCase());
        sc.close();
    }
}

