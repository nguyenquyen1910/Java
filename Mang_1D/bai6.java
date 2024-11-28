//tim phan tu co so lan xuat hien be nhat lon nhat

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        int[] count = new int[1000001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        Arrays.sort(a);
        int cnt=-1,val=-1;
        for(int i=0;i<n;i++){
            if(count[a[i]]>cnt){
                val=a[i];
                cnt=count[a[i]];
            }
        }
        System.out.print(val + " " + cnt);
    }
}
