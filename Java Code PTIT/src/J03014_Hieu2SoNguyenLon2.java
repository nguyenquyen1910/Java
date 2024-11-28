import java.math.BigInteger;
import java.util.Scanner;

public class J03014_Hieu2SoNguyenLon2 {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        BigInteger res=a.subtract(b);
        System.out.print(res);
    }
    public static void main(String[] args) {
        testCase();
    }
}
