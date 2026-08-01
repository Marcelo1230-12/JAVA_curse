import java.util.Scanner;

public class Compute_Average_of_Three_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.print("Enter the third number:");
        int c = sc.nextInt();
        System.out.println("The average of " + a + " and " + b + " and " + c+" is "+ average(a,b,c));
        sc.close();
    }
    static int average(int ... numbers){
        int ave=0;
        for(int i :numbers){
            ave+=i;
        }// this take a divisor of a n numbers in the divisor
        return ave/numbers.length;
    }

}
