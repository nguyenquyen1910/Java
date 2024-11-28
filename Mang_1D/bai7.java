import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        int[] res = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                res[j++]=a[i];
            }
        }
        res[j++]=a[n-1];
        for(int i=0;i<j;i++){
            System.out.print(res[i] + " ");
        }
    }
}
