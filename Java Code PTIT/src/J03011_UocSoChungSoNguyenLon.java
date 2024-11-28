import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UocSoChungSoNguyenLon {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        System.out.println(a.gcd(b));
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}
