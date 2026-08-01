import java.util.Scanner;

public class Sum_of_First_n_Prime_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n<=10000: ");
        int n = sc.nextInt();
        if(n==0) {
            System.out.println("1 is not a prime number");
        }
        int hold=0;
        for (int i = 2; i <=n; i++) {
            boolean isPrime = true;
            for(int j = 2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
                }
            }
            if(isPrime){
                hold+=i;
            }

        }
        System.out.println( "the sum is:"+hold);
        sc.close();
    }
}
