import java.util.Scanner;

public class Integer_to_String_Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        String str =String.valueOf(num);

        System.out.print("The integer is pass to string is "+str);
        sc.close();
    }
}
