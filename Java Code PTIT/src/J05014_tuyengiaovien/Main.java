package J05014_tuyengiaovien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> teachers = new ArrayList<>();
        for(int i=0;i<n;i++){
            teachers.add(new Teacher(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(teachers);
        teachers.forEach(System.out::println);
    }
}
