import java.util.Scanner;

public class mang_cong_don {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Long[] a=new Long[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextLong();
        }
        Long[] dp=new Long[n+1];
        dp[0] = 0L;
        dp[1]=a[1];
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+a[i];
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(dp[r]-dp[l-1]);
        }
    }
}
