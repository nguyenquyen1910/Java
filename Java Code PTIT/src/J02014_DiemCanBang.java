import java.util.Scanner;

public class J02014_DiemCanBang {
    public static Scanner sc = new Scanner(System.in);
    public static int findPosBalance(int a[],int n,int sum){
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=a[i];
            if(sum1==sum-sum1+a[i]){
                return i+1;
            }
        }
        return -1;
    }
    public static void testCase(){
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(findPosBalance(a,n,sum));
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
