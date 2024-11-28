package J05043_tinhthunhapnhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Staff> staffList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            staffList.add(new Staff(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
 */