
import java.util.Scanner;

public class caitui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=0;test<t;test++){
            int n=sc.nextInt();
            int v=sc.nextInt();
            int[] a = new int[n+1];
            int[] c = new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                c[i]=sc.nextInt();
            }
            long[][] dp = new long[n+1][v+1];
            for(int i=1;i<=n;i++){
                for(int j=0;j<=v;j++){
                    dp[i][j]=dp[i-1][j];
                    if(j>=a[i]){
                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-a[i]]+c[i]);
                    }
                }
            }
            System.out.println(dp[n][v]);
        }
    }
}
