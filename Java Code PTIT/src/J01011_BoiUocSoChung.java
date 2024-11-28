import java.util.Scanner;

public class J01011_BoiUocSoChung {
    public static Scanner sc = new Scanner(System.in);
    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    public static void testCase(){
        long a=sc.nextInt();
        long b=sc.nextInt();
        System.out.println(lcm(a,b)+" "+gcd(a,b));
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
