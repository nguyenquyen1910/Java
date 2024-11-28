import java.util.Scanner;

public class J01007_KiemTraSoFibonaci {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo=new long[100];
    public static void init(){
        fibo[0]=0l;
        fibo[1]=1l;
        for(int i=2;i<100;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static Boolean isFibo(long n){
        for(long i : fibo){
            if(i==n){
                return true;
            }
            else if(i>n){
                return false;
            }
        }
        return false;
    }
    public static void testCase(){
        long n=sc.nextLong();
        if(isFibo(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        init();
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
