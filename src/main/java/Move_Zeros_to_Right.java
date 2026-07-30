import java.util.Scanner;

public class Move_Zeros_to_Right {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int length = sc.nextInt();
        int [] lsit=new int[length];
        System.out.println("Enter the list:");
        for (int j=0;j<length;j++){
            lsit[j]=sc.nextInt();
        }
        int []nlist=new int[length];
        int index=0;

        for (int i=0;i<lsit.length;i++){
            if(lsit[i]>0){
                nlist[index]=lsit[i];
                index++;
            }
        }
        for (int j=0;j<nlist.length;j++){
            if(lsit[j]==0){
                nlist[index]=lsit[j];
                index++;
            }
        }
        for(int i : nlist){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
