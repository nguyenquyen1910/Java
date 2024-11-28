import java.util.Scanner;

public class J01012_UocChiaHetCho2 {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        long n=sc.nextLong();
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                if (i % 2 == 0) cnt++;
                if ((n / i) % 2 == 0 && i != n / i) cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
