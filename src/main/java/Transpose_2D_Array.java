
import java.util.Scanner;

public class Transpose_2D_Array {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size1,size2;
    System.out.print("enter the row of the array:");
    size1 = sc.nextInt();
    System.out.print("enter the colum of the array:");
    size2 = sc.nextInt();
    int [] []array=new int[size1][size2];

    System.out.print("2D Array:");
    for (int i=0;i<size1;i++){
        for (int j=0;j<size2;j++){
            array[i][j]=sc.nextInt();
        }
    }

    for  (int i=0;i<size2;i++){
        for(int j=0;j<size1;j++){
            System.out.print(array[j][i]+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
