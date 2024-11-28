import java.util.Scanner;

public class hinh_vuong_lon_nhat {
    public static void main(String[] args) {
        int[][] a = new int[500][500];
        int[][] dp = new int[500][500];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a[i][j]==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                }
                ans=Math.max(ans,dp[i][j]);
            }
        }
        System.out.println(ans);
    }
}