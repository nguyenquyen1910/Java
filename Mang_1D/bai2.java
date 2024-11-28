//Trung binh nguyen to

import java.util.Scanner;

public class bai2 {
    private static Boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        int sumPrime=0;
        int cPrime=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(isPrime(a[i])){
                ++cPrime;
                sumPrime+=a[i];
            }
        }
        float res = (float)sumPrime/cPrime;
        System.out.printf("%.3f",res);
    }
}
