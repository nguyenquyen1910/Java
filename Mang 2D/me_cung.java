import java.util.Scanner;
import java.util.Vector;
public class me_cung {
    public static int n, m;
    public static int[][] a = new int[100][100]; 
    public static String s;
    public static Vector<String> res;
    public static void Try(int i,int j){
        if(i==n && j==n){
            res.add(s);
        }
        if(i+1<=n && a[i+1][j]==1){
            a[i+1][j]=0;
            Try(i+1,j);
            s+='D';
            a[i+1][j]=1;
        }
        if(j+1<=n && a[i][j+1]==1){
            a[i][j+1]=0;
            Try(i,j+1);
            s+='L';
            a[i][j+1]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(a[1][1]==0){
            System.out.println("");
        }
        Try(1,1);
    }
}
