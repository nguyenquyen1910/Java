import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n=sc.nextLong();
        long tmp=1,res=0;
        for(int i=1;i<=n;i++){
            tmp*=i;
            res+=tmp;
        }
        System.out.println(res);

    }
}
