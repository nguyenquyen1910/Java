import java.util.Scanner;

public class J02021_LietKeToHop2 {
    public static int n,k,cnt=0;
    public static int[] a=new int[100];
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                for(int idx=1;idx<=k;idx++){
                    System.out.print(a[idx]);
                }
                cnt++;
                System.out.print(" ");
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
