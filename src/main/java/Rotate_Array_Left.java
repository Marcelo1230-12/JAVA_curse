import java.util.Scanner;

public class Rotate_Array_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int lng;
        System.out.print("Enter the size of the array");
        lng = sc.nextInt();
        int  []list = new int[lng];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<lng;i++){
            list[i]=sc.nextInt();
        }
        int  []list2 = new int[lng];
        for (int i = 0; i < lng - 1; i++) {
            list2[i] = list[i + 1];
        }// this for loop is to changhe the order of the list in any size of the array list 😉
        list2[lng - 1] = list[0];
        for(int a : list2){
            System.out.print("["+a+","+"]");
        }

        sc.close();
    }
}
