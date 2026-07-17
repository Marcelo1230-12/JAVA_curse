import java.util.Scanner;

public class First_and_Last_Elements_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbe;
        System.out.print("Enter the size of the list: ");
        numbe = sc.nextInt();
        int []list = new int[numbe];
        System.out.println("Enter the elements of the list: ");
        for(int i=0;i<numbe;i++){
            list[i]=sc.nextInt();
        }
        int []list2 = new int[numbe];
//        for (int i = 0;i<numbe-1;i++){
//            list2[i]=list[i+1];//10 20 30
//                               //20 30 10
//        }
        list2[0]=list[numbe-1];
        list2[numbe-1]=list[0];
        for(int i=1;i<numbe-1;i++){
            list2[i]= list[i];
        }
            for(int i :list2){
                System.out.print(i+" ");
            }

        sc.close();
    }
}
