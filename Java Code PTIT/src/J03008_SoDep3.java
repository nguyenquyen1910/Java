import java.util.Scanner;

public class J03008_SoDep3 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isReverse(String s){
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        return s.equals(str.toString());
    }
    public static void testCase(){
        String s=sc.next();
        if(isReverse(s)==false){
            System.out.println("NO");
            return;
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(sc.next());
        while(n-->0){
            testCase();
        }
    }
}
