import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        if(a.compareTo(b)<0){
            BigInteger temp=a;
            a=b;
            b=temp;
        }
        if(a.mod(b).equals(BigInteger.ZERO)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
