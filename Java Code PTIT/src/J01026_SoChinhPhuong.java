import java.util.Scanner;

public class J01026_SoChinhPhuong {
    public static Scanner sc = new Scanner(System.in);
    public static Boolean isSquareNumber(int n){
        int sqrt=(int) Math.sqrt(n);
        return n==sqrt*sqrt;
    }
    public static void testCase(){
        int n=sc.nextInt();
        System.out.println(isSquareNumber(n) ? "YES" : "NO");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
