import java.util.Arrays;
import java.util.Scanner;

public class Generate_Spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        int top=0, bottom=n-1, left=0, right=n-1, start=1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=start++;// left to right
            }
            top++;
            for(int i =top;i<=bottom;i++){
                arr[i][right]=start++;//top to bottom
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=start++;//right to left
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=start++;//bottom to up
            }
            left++;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
