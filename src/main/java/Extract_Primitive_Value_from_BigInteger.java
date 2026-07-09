import java.math.BigInteger;
import java.util.Scanner;

public class Extract_Primitive_Value_from_BigInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        BigInteger x;
        System.out.print("Enter the value of x :");
        x = sc.nextBigInteger();
        int intvalue= x.intValue();
        double doublevalue= x.doubleValue();
        long longvalue= x.longValue();
        float floatvalue= x.floatValue();
        byte bytevalue= x.byteValue();
        short shortvalue= x.shortValue();
        System.out.println("Int value is "+intvalue);
        System.out.println("Double value is "+doublevalue);
        System.out.println("Float value is "+floatvalue);
        System.out.println("Byte value is "+bytevalue);
        System.out.println("LongValue is "+longvalue);
        System.out.println("Short value is "+shortvalue);

        sc.close();
    }
}
