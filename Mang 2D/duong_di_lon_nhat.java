import java.util.Arrays;
import java.util.Scanner;

public class duong_di_lon_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a = new int[n+1][m+1];
        Integer[][] dp = new Integer[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++){
            dp[i][1]=dp[i-1][1]+a[i][1];
        }
        for(int i=1;i<=m;i++){
            dp[1][i]=dp[1][i-1]+a[1][i];
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=m;j++){
                dp[i][j]=Math.max(dp[i-1][j],Math.max(dp[i-1][j-1],dp[i][j-1]))+a[i][j];
            }
        }
        System.out.print(dp[n][m]);
    }
}