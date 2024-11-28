import java.math.BigInteger;
import java.util.Scanner;

public class J03013_Hieu2SoNguyenLon1 {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        BigInteger res=a.subtract(b).abs();
        StringBuilder ans=new StringBuilder(res.toString());
        int maxLen=Math.max(a.toString().length(), b.toString().length());
        while(ans.length()<maxLen){
            ans.insert(0,'0');
        }
        System.out.println(ans.toString());
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}
