import java.util.Scanner;

public class TichTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String num = sc.next();
            long mul=1, sum=0;
            for(int i=0;i<num.length();i++) {
                if(i%2==0){
                    if(num.charAt(i) != '0'){
                        mul*=(num.charAt(i)-'0');
                    }
                }
                else{
                    sum+=(num.charAt(i)-'0');
                }
            }
            System.out.println(mul+" "+sum);
        }
    }
}
