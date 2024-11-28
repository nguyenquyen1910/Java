import java.util.Scanner;

public class dem_tan_suat {
    public static int[] cnt=new int[10000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max_value=-(int)1e9;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]++;
            max_value=Math.max(max_value, a[i]);
        }
        for(int i=0;i<=max_value;i++){
            if(cnt[i]!=0){
                System.out.println(i+" "+cnt[i]);
            }
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            if(cnt[a[i]]!=0){
                System.out.print(a[i]+" "+cnt[a[i]]);
                cnt[a[i]]=0;
            }
        }
    }
}
