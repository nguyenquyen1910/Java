package bangkenhapkho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> danhSach = new ArrayList<>();
        for(int i=0;i<n;i++){
            danhSach.add(new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

        danhSach.forEach(System.out::println);
    }
}
