import java.util.Scanner;

public class UocSoLonNhat {
    public static long maxPrimeFactor(long n) {
        long res=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                   res=Math.max(res, i);
                   n/=i;
                }
            }
        }
        if(n!=1) res=Math.max(res, n);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(maxPrimeFactor(n));
        }
    }
}
