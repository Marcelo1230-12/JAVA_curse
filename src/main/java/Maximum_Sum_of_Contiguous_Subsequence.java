import java.util.Scanner;

public class Maximum_Sum_of_Contiguous_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers input: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers input: ");
        for(int i =0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
       int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int total = 0;
            for(int j=i; j<n; j++){
                total+=arr[j];
                max = Math.max(total,max);
            }
        }

        System.out.println("the maximum sum is "+max);

        sc.close();
    }
}
