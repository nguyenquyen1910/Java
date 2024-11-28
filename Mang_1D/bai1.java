//Dem chan,le

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cEven=0,cOdd=0,sumEven=0,sumOdd=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                ++cEven;
                sumEven+=a[i];
            }
            else{
                ++cOdd;
                sumOdd+=a[i];
            }
        }
        System.out.println(cEven + "\n" + cOdd + "\n" + sumEven + "\n" + sumOdd);
    }
}
