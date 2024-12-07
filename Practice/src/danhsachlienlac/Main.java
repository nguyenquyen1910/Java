package danhsachlienlac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Student> students = new ArrayList<>();
        while(sc.hasNextLine()) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("HUONGDAN.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Tutorial> tutorials = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] info = sc1.nextLine().trim().split("\\s+");
            String lecName = "";
            for(int j=0;j<info.length-1;j++){
                lecName+=info[j]+" ";
            }
            lecName = lecName.trim();
            for(int j=0;j<Integer.parseInt(info[info.length-1]);j++){
                String[] tmp = sc1.nextLine().trim().split("\\s+", 2);
                tutorials.add(new Tutorial(tmp[0], tmp[1], lecName));
            }
        }

        for(Tutorial t: tutorials){
            for(Student s: students){
                if(t.getStuId().equals(s.getStuId())){
                    t.setStudent(s);
                    break;
                }
            }
        }

        Collections.sort(tutorials);
        tutorials.forEach(System.out::println);
    }
}
