import java.util.Arrays;
import java.util.Scanner;

public class pytago {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            a[i]*=a[i];
        }
        Arrays.sort(a);
        for(int i=n-1;i>=2;i--){
            int l=0,r=i-1; 
            while(l<r){
                if(a[l]+a[r]==a[i]){
                    System.out.println("YES");
                    return;
                }
                else if(a[l]+a[r]<a[i]){
                    ++l;
                }
                else --r;
            }
        }
        System.out.println("NO");
    }
}
