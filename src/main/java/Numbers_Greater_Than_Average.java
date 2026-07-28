import java.util.Scanner;

public class Numbers_Greater_Than_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int leng ;
        System.out.print("enter the size of the array");
        leng = sc.nextInt();
        int [] lst = new int [leng];
        for(int i=0;i<leng;i++){
            lst[i] = sc.nextInt();
        }
        System.out.println("the number larger that the average is:");
            int average =0;
        for(int j=0;j<leng;j++){
            average += lst[j];
        }
            average /=leng;
        for(int k=0;k<leng;k++){
            if(lst[k]>average){
                System.out.println(lst[k]);
            }
        }

        sc.close();
    }
}