import java.math.BigInteger;

public class big_integer {
    public static void main(String[] args) {
        BigInteger s=new BigInteger("138495748495978959595");
        BigInteger t=new BigInteger("1000000007");
        BigInteger sum=s.add(t);//Tong
        BigInteger sub=s.subtract(t);//Hieu
        BigInteger mul=s.multiply(t);//Tich
        BigInteger div=s.divide(t);//Thuong
        BigInteger res=s.modPow(new BigInteger("100"), t);//Tinh s^100%t
        System.out.println(sum);
    }
}
