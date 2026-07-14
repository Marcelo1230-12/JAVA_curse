import java.util.Arrays;
import java.util.Scanner;

public class as_10_First_or_Last_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.println("Enter the array size");
    n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
        System.out.println("Enter the element "+"#"+i);
        a[i]=sc.nextInt();
    }

    for (int i=0;i<n;i++){
        if (a[0]==10 && a[n-1]==10){
            System.out.println("true");
            break;
        }
        else{
            System.out.println("false");
            break;
        }
    }
        System.out.println("The array is:");
for (int i:a){
    System.out.print(i+" ");
}
        sc.close();
    }
}

