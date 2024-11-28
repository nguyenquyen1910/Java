import java.util.Scanner;

public class tohop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();int k=sc.nextInt();
        int[][] C = new int[100][100];
        for(int i=0;i<100;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    C[i][j]=1;
                }
                else{
                    C[i][j]=C[i-1][j]+C[i-1][j-1];
                    C[i][j]%=1000000007;
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<=i;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}