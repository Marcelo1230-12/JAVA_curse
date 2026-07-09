import java.util.Scanner;

public class Check_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int number;
        System.out.println("Enter the number");
        number = sc.nextInt();
        if(number%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
}
