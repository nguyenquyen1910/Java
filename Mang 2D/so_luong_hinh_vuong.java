import java.util.Scanner;

public class so_luong_hinh_vuong {
    public static void main(String[] args) {
        int[][] a = new int[500][500];
        int[][] dp = new int[500][500];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++) dp[i][0]=a[i][0];
        for(int i=0;i<m;i++) dp[0][i]=a[0][i];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(a[i][j]==1){
                    if(dp[i-1][j]>0 && dp[i-1][j-1]>0 && dp[i][j-1]>0){
                        dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                    }
                    else dp[i][j]=1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans+=dp[i][j];
            }
        }
        System.out.println(ans);
    }
}