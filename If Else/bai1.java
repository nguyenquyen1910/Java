import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long y = x*x*x + 3*x*x + x + 1;
        System.out.print(y);
    }
}