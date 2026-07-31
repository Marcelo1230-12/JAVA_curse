import java.util.Scanner;
public class Count_Prime_Numbers_N{
public static void main(String []argv){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the numbers(n):");
int  n=sc.nextInt();

int hold=0;

if(n==1){
    System.out.println("is not prime");
}
for(int i=2;i<=n;i++){
    boolean flag=true;
  for(int j=2;j<i;j++){
      if(i%j==0){
          flag=false;
          break;
      }
  }
  if(flag){
      hold++;
  }
}
    System.out.println(hold);
sc.close();
}

}