import java.util.Scanner;

public class Print_Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        String[][] matrix = new String[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.next().toLowerCase();
            }
        }
        for(int j=0;j<rows;j++){
            for(int k=0;k<columns;k++){
                if(matrix[j][k].equals("true")){
                    System.out.print("t");
                }
                else if(matrix[j][k].equals("false")){
                    System.out.print("f");
                }
            }
            System.out.println();
        }
   sc.close();
    }

    }

