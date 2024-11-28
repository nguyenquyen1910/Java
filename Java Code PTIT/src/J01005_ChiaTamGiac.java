import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int n=sc.nextInt();
        int h=sc.nextInt();
        for(double i=1d;i<n;i++){
            System.out.print(String.format("%.6f ", Math.sqrt(i/n) * h));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
