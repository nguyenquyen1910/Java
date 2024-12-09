package dientichdagiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            int n = sc.nextInt();
            Point[] points = new Point[n];
            for(int i=0;i<n;i++){
                points[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            Polygon polygon = new Polygon(points);
            System.out.println(polygon);
        }
    }
}
