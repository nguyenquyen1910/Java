import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger num = sc.nextBigInteger();
        while(num.toString().length() > 1){
            int len = num.toString().length();
            BigInteger a = new BigInteger(num.toString().substring(0, len/2));
            BigInteger b = new BigInteger(num.toString().substring(len/2, len));
            num = a.add(b);
            System.out.println(num.toString());
        }
    }
}
