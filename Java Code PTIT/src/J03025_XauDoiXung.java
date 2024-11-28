import java.util.Scanner;

public class J03025_XauDoiXung {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                ++cnt;
            }
        }
        return (s.length()%2==0 && cnt==1) || (s.length()%2==1 && cnt<=1);
    }

    public static void testCase() {
        String s = sc.nextLine();
        if(check(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            testCase();
        }
    }
}
