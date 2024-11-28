import java.util.Scanner;

public class so_diem_cuc_dai {
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[100][100];
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean check=true;
                for(int k=0;k<4;k++){
                    int i1=i+dx[k];
                    int j1=j+dy[k];
                    if(i1>=0 && i1<n && j1>=0 && j1<m){
                        if(a[i1][j1]>=a[i][j]){
                            check=false;
                            break;
                        }
                    }
                }
                if(check) ++ res;
            }
        }
        System.out.print(res);
    }
}
