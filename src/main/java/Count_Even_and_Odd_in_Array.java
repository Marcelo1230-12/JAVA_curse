import java.util.Scanner;

public class Count_Even_and_Odd_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,odd=0,even=0 ;
        System.out.print("enter the size of the array: ");
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i :arr){
            if(i%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
            System.out.print("even elemets: "+even);
        System.out.println();
        System.out.print("odd elemets: "+odd);
        sc.close();
    }
}
