import java.util.Scanner;
public class phan_tich_thua_so {
    public static void testCase(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            int cnt=0;
            while(n%i==0){
                n/=i;
                cnt++;
            }
            if(cnt!=0){
                System.out.printf("%d(%d) ",i,cnt);
            }
        }
        if(n!=1){
            System.out.printf("%d(%d) ",n,1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            testCase(n);
            System.out.println();
        }
    }
}
