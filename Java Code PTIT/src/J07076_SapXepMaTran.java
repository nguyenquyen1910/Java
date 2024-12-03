import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int n=sc.nextInt(), m=sc.nextInt(), index=sc.nextInt();
            int[][] a = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                b[i]=a[i][index-1];
            }
            Arrays.sort(b);
            for(int i=0;i<n;i++){
                a[i][index-1]=b[i];
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
