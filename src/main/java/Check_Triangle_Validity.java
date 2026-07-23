import java.util.Scanner;

public class Check_Triangle_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz1,sz2,sz3;
        System.out.print("Enter the first number:");
        sz1 = sc.nextInt();
        System.out.print("Enter the second number:");
        sz2 = sc.nextInt();
        System.out.print("Enter the third number:");
        sz3 = sc.nextInt();
if((sz1+sz2)>sz3&&(sz1+sz3)>sz2&&(sz2+sz3)>sz1) System.out.println("The triangle is valid");
else System.out.println("The triangle is not valid");
        sc.close();
    }
}
