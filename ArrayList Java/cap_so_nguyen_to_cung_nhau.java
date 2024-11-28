import java.util.Scanner;

public class cap_so_nguyen_to_cung_nhau {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(gcd(a[i],a[j])==1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
