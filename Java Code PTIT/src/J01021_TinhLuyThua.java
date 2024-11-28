import java.util.Scanner;

public class J01021_TinhLuyThua {
    public static Scanner sc = new Scanner(System.in);
    public static int Mod=(int) 1e9+7;
    public static long powMod(int n,long k){
        if(k==0) return 1;
        if(k==1) return n%Mod;
        long tmp=powMod(n,k/2);
        if(k%2==0){
            return (tmp*tmp)%Mod;
        }
        else{
            return (((tmp*tmp)%Mod)*n)%Mod;
        }
    }
    public static void main(String[] args) {
        while(true){
            int a=sc.nextInt();
            long b=sc.nextLong();
            if(a==0 && b==0){
                return;
            }
            System.out.println(powMod(a,b));
        }
    }
}
