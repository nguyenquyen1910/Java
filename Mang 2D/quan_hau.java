import java.util.Arrays;
import java.util.Scanner;

public class quan_hau {
    public static int n;
    public static int ans;
    public static boolean[] cot = new boolean[100];
    public static boolean[] xuoi= new boolean[100];
    public static boolean[] nguoc= new boolean[100];
    public static int[] a = new int[100];
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(cot[j]==false && xuoi[i+j-1]==false && nguoc[i-j+n]==false){
                a[i]=j;
                cot[j]=true;
                xuoi[i+j-1]=true;
                nguoc[i-j+n]=true;
                if(i==n){
                    ans++;
                }
                else{
                    Try(i+1);
                }
                cot[j]=false;
                xuoi[i+j-1]=false;
                nguoc[i-j+n]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(cot, false);
        Arrays.fill(xuoi, false);
        Arrays.fill(nguoc, false);
        n=sc.nextInt();
        ans=0;
        Try(1);
        System.out.println(ans);
    }
}
