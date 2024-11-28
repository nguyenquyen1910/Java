//Liet ke cac gia tri khac nhau trong mang

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        int [] count = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(count[a[i]]!=0){
                System.out.print(a[i]+" ");
            }
            count[a[i]]=0;
        }
    }
}
