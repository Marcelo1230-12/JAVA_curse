import java.util.Scanner;

public class Check_Four_Numbers_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n1,n2,n3,n4;
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        n3 = sc.nextInt();
        System.out.print("Enter fourth number: ");
        n4 = sc.nextInt();
        if(n1==n2 && n2==n3 && n3==n4){
            System.out.println("The equal numbers are equal");
        }
        else{
            System.out.println("The equal numbers are not equal");
        }
        sc.close();
    }
}
