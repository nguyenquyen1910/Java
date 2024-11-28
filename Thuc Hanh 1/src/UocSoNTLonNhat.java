import java.util.Scanner;

public class UocSoNTLonNhat {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        long n=sc.nextLong();
        long res=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    res=Math.max(res,i);
                    n/=i;
                }
            }
        }
        if(n!=1){
            res=Math.max(res,n);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
