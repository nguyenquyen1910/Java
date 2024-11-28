import java.util.Arrays;
import java.util.Scanner;

public class hopvagiao {
    public static int[] cnt=new int[10000001];
    public static void testCase(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[]=new int[n+1],b[]=new int[m+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]=-1;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            if(cnt[b[i]]==-1){
                cnt[b[i]]=2;
            }
            else cnt[b[i]]=1;
        }
        for(int i=0;i<=1e7;i++){
            if(cnt[i]!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        for(int i=0;i<=1e7;i++){
            if(cnt[i]==2){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=0;test<t;test++){
            testCase();
            System.out.println();
        }
    }
}