import java.util.Scanner;

public class J01022_XauNhiPhan {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo=new long[100];
    public static void init(){
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<=92;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static char findChar(int n,long k){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k<=fibo[n-2]) return findChar(n-2,k);
        else return findChar(n-1,k-fibo[n-2]);
    }
    public static void testCase(){
        int n=sc.nextInt();
        long k=sc.nextLong();
        System.out.println(findChar(n,k));
    }
    public static void main(String[] args) {
        init();
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
