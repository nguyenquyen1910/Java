package J05064_bangthunhapgiaovien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int count(List<Teacher> list, Teacher teacher){
        String s = teacher.getId().substring(0,2);
        int cnt=0;
        for(Teacher t:list){
            if(t.getId().startsWith(s)) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> teachers = new ArrayList<>();
        for(int i=0;i<n;i++){
            Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            if(teacher.getId().startsWith("HT") && count(teachers, teacher)==1 || teacher.getId().startsWith("HP") && count(teachers, teacher)==2) continue;
            teachers.add(teacher);
        }
        teachers.forEach(System.out::println);
    }
}
