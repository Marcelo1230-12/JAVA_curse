import java.util.Arrays;
import java.util.Scanner;

public class Move_Positives_Right {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the leng of the list:");
        int leng = sc.nextInt();
        int [] list = new int[leng];
        System.out.println("Enter the elements of the list:");
        for(int i=0;i<leng;i++){
            list[i]=sc.nextInt();
        }
        int []nlist=new int[leng];
        int index =0;
        // check the negatives values
for (int i = 0; i < list.length; i++) {
    if(list[i]<=0){
       nlist[index]=list[i];
       index++;
    }
}
//check the positives values
for (int i = 0; i < list.length; i++) {
    if(list[i]>0){
       nlist[index]=list[i];
       index++;
    }
}
for(int l:nlist){
    System.out.print(l+" ");
}
        sc.close();
    }
}
