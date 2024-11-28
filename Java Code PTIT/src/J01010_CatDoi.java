import java.util.Scanner;

public class J01010_CatDoi {
    public static Scanner sc = new Scanner(System.in);
    public static long solveNumber(String s){
        long n=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            switch (x){
                case '0':
                case '8':
                case '9':
                    n=n*10;
                    break;
                case '1':
                    n=n*10+1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    }
    public static void testCase(){
        String s = sc.next();
        long res = solveNumber(s);
        if (res == 0) {
            System.out.println("INVALID");
        } else {
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
            System.out.println();
        }
    }
}
