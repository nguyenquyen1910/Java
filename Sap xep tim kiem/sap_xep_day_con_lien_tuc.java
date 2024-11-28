import java.util.Arrays;
import java.util.Scanner;

public class sap_xep_day_con_lien_tuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                System.out.print((i+1)+" ");
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]!=b[i]){
                System.out.print(i+1);
                break;
            }
        }
    }    
}
