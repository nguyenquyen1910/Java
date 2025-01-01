package matran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), p=sc.nextInt();
        Matrix a = new Matrix(sc, n,m);
        Matrix b = new Matrix(sc, m,p);
        Matrix c = a.mul(b);
        System.out.println(c);
    }
}
