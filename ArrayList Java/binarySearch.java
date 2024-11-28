import java.util.Scanner;
public class binarySearch {
    public static boolean binarySearch(int a[],int n,int x){
        int l=0,r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                return true;
            }
            else if(a[m]<x){
                l=m+1;
            }
            else r=m-1;
        }
        return false;
    }
    // Bang de quy chp mang giam dan
    public static boolean binarySearchDeQuy(int a[],int l,int r,int x){
        if(l>r) return false;
        int m=(l+r)/2;
        if(a[m]==x) return true;
        else if(a[m]<x) return binarySearchDeQuy(a, l, m-1, x);
        else binarySearchDeQuy(a, m+1, r, x);
    }
    //Tim vi tri dau tien bang x
    //Tim vi tri cuoi cung bang x
    //Tim vi tri dau tien cua x
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}
