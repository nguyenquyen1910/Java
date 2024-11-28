import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiSoChungNhoNhat {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        System.out.println((a.multiply(b)).divide(a.gcd(b)));
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
