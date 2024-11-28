//Sliding Window

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<k;i++) sum+=a[i];
        for(int i=k;i<n;i++){
            System.out.print(sum + " ");
            sum=sum-a[i-k]+a[i];
        }
        System.out.print(sum);
    }
}
