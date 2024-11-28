import java.util.Scanner;

public class J02103_TichVoiMaTranChuyenVi {
    public static Scanner sc = new Scanner(System.in);
    public static int[][] mulMatrix(int[][] a,int [][] b,int n,int m,int p){
        int[][] res=new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                res[i][j]=0;
                for(int k=0;k<m;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }
    public static void testCase(int test){
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[][] a=new int[n][m];
        int[][] tA=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                tA[j][i]=a[i][j];
            }
        }
        int[][] res=mulMatrix(a,tA,n,m,n);
        System.out.println("Test "+test+":");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int test=1;test<=t;test++){
            testCase(test);
        }
    }
}
