import java.util.Scanner;

public class J01006_SoFibonaci {
    public static Scanner sc = new Scanner(System.in);
    public static Long[] fibo=new Long[100];
    public static void init(){
        fibo[1]=1l;
        fibo[2]=1l;
        for(int i=3;i<=92;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static void testCase(){
        int n=sc.nextInt();
        System.out.println(fibo[n]);
    }
    public static void main(String[] args) {
        init();
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
