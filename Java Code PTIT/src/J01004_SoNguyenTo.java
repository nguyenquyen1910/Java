import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    public static Boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void testCase(){
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
