import java.util.Scanner;

public class Generate_Spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 5");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        int top=0, bottom=n-1, left=0, right=n-1, start=1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=start++;// left to right
            }
            top++;
            for(int i =top;i<=bottom;i++){
                arr[i][left]=start++;//top to bottom
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=start++;//right to left
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][right]=start++;//bottom to up
            }
            left++;
        }
        sc.close();
    }
}
