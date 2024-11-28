import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(int t){
        int n=sc.nextInt();
        System.out.print("Test "+t+": ");
        for(int i=2;i<Math.sqrt(n);i++){
            int cnt=0;
            if(n%i==0){
                while(n%i==0){
                    cnt++;
                    n/=i;
                }
                System.out.print(i+"("+cnt+") ");
            }
        }
        if(n!=1){
            System.out.print(n+"(1)");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            testCase(i);
            System.out.println();
        }
    }
}
