import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Multiply_Without_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int number ,multiply;
        System.out.print("enter the first number:");
       number = sc.nextInt();
        System.out.print("enter the second number:");
        multiply = sc.nextInt();
        int hold=0;
        int tota=0;
        while(tota<number){
            hold+=multiply;
            tota++;
        }
        System.out.println("the result is "+hold);
        sc.close();
    }
}
