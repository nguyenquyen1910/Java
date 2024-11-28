import java.util.Scanner;

public class J01002_TongNSoDauTien {
    public static Scanner sc = new Scanner(System.in);
    public static  void testCase(){
        long n=sc.nextLong();
        long res=n*(n+1)/2;
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0) {
            testCase();
        }
    }
}
