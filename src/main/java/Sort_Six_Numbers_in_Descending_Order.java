import java.util.Arrays;
import java.util.Scanner;

public class Sort_Six_Numbers_in_Descending_Order {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the long of the list:");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the list:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       Arrays.sort(arr);
        for  (int i =arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
/*or
 Bubble Sort (sorts arr directly in descending order)
for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr.length - 1 - i; j++){
        if(arr[j] < arr[j+1]){  // Descending: smaller goes right
            // Swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}

 Print sorted array
for(int num : arr){
    System.out.println(num);
}

*/

        sc.close();
    }
}