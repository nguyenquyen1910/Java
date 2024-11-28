import java.util.Scanner;

public class J02022_SoXaCach {
    public static int n;
    public static int[] a;
    public static boolean[] used;
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(int a[],int n){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                return false;
            }
        }
        return true;
    }
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(used[j]==false){
                used[j]=true;
                a[i]=j;
                if(i==n){
                    if(check(a,n)) {
                        for (int k = 1; k <= n; k++) {
                            System.out.print(a[k]);
                        }
                        System.out.println();
                    }
                }
                else Try(i+1);
                used[j]=false;
            }
        }
    }
    public static void testCase(){
        n=sc.nextInt();
        a=new int[100];
        used=new boolean[100];
        Try(1);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
