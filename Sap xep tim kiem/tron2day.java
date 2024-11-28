import java.util.Arrays;
import java.util.Scanner;

public class tron2day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                System.out.print(a[i++]+" ");;
            }
            else{
                System.out.print(b[j++]+" ");
            }
        }
        while(i<n) System.out.print(a[i++]+" ");
        while(j<m) System.out.print(b[j++]+" ");
    }    
}
