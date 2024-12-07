import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DaySo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        List<BigInteger> list = new ArrayList<>();
        BigInteger sum = new BigInteger("0");
        for(int i=0;i<n;i++){
            list.add(sc.nextBigInteger());
            sum = sum.add(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(n-1));
        System.out.println(sum);
    }
}
