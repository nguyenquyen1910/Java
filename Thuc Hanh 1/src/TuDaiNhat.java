import java.util.Scanner;

public class TuDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while (sc.hasNext()) {
            String tmp = sc.next();
            if (tmp.length() > res.length()) {
                res = tmp;
            }
        }
        System.out.println(res + " - " + res.length());
    }

}
