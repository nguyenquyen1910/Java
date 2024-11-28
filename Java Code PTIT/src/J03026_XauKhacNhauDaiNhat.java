import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(s1.length(),s2.length()));
        }
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            testCase();
        }
    }
}
