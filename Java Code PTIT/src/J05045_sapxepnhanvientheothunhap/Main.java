package J05045_sapxepnhanvientheothunhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Staff> staff = new ArrayList<>();
        for(int i=0;i<n;i++){
            staff.add(new Staff(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(staff);
        staff.forEach(System.out::println);
    }
}
