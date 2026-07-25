import java.util.Scanner;

public class Binary_Zeros_Count {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nume;
       int zeros=0;
        System.out.print("Enter the number: ");
        nume = sc.nextInt();
        int i =0;
       int []lista = new int[32];
        while(nume>0){
            lista[i]=nume%2;
            nume=nume/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print((lista[j])+" ");
            if(lista[j]==0){
                zeros++;
            }
        }
        System.out.println();
        System.out.println("the number of zeros in the binary convertion is "+zeros);
       sc.close();
    }
}
