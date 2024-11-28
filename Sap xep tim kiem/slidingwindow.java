import java.util.Scanner;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //Tinh day con k phan tu dau tien
        long sum=0;
        for(int i=0;i<k;i++) sum+=a[i];
        int pos=0;long res=sum;
        for(int i=1;i<=n-k;i++){
            sum=sum-a[i-1]+a[i+k-1];
            if(sum>res){
                res=sum;
                pos=i;
            }
        }
        System.out.println(res);
        for(int i=0;i<k;i++){
            System.out.print(a[(int)pos+i]+" ");
        }
    }
}

