public class Divisible_by_3_5_both {
    public static void main(String[] args) {
            System.out.println("Divisible by 3\n");
        for (int i = 1; i <=100;i++){
            if(i%3==0){
            System.out.print(i+" ");}
        }
        System.out.println();
            System.out.println("Divisible by 5\n");
        for (int i = 1; i <=100;i++){
            if(i%5==0){
                System.out.print(i+" ");}
        }
        System.out.println();
            System.out.println("Divisible by Both");
        for (int i = 1; i <=100;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");}
        }
    }
}
