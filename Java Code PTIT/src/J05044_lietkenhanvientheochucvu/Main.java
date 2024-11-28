package J05044_lietkenhanvientheochucvu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Staff> staff = new ArrayList<>();
        for(int i=0;i<n;i++){
            staff.add(new Staff(i, sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        String query = sc.nextLine();
        staff.forEach(it -> {
            if(it.getRole().equals(query)){
                System.out.println(it);
            }
        });
    }
}
