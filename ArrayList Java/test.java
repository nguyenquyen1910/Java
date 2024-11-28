import java.util.Scanner;

public class test {
    public static int[] a=new int[100];
    public static int n,k;
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                for(int x=1;x<=k;x++){
                    System.out.print(a[x]+" ");
                }
                System.out.println();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Try(1);
    }
}
