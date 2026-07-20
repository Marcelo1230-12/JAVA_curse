import java.util.Scanner;

public class Divide_Using_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n1,n2;
        System.out.print("enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("enter the second number: ");
        n2 = sc.nextInt();

        int hold= 0;
        while(n1>0){
            n1 -=n2;
            hold++;
        }
        System.out.println("the result is "+hold);
        sc.close();

    }
}
