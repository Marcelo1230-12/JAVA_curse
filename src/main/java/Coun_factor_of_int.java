import java.util.Scanner;

public class Coun_factor_of_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input an integer");
        n = sc.nextInt();
        int factor=0;
        for (int i = 1; i <= n; i++) {
    if((n%i)==0){
        factor++;
    }
        }
        System.out.println("Factor is "+ factor);
    }
}
