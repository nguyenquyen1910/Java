package J05038_bangketienluong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Staff> staffList = new ArrayList<>();
        for(int i=0;i<n;i++){
            staffList.add(new Staff(i,sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(staffList);
        for(Staff staff : staffList){
            System.out.println(staff);
        }
    }
}
