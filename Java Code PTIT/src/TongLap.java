import java.math.BigInteger;
import java.util.Scanner;

public class TongLap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        while(x.length()>1){
            BigInteger s1=new BigInteger(x.substring(0,x.length()/2));
            BigInteger s2=new BigInteger(x.substring(x.length()/2));
            BigInteger sum=s1.add(s2);
            System.out.println(sum.toString());
            x=sum.toString();
        }
    }
}
