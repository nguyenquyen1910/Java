import java.util.Scanner;

public class J01017_SoLienKe {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String s=sc.next();
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'))!=1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            testCase();
        }
    }
}
