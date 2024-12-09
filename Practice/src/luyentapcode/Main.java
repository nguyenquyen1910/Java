package luyentapcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().trim().split(" ", 2);
            students.add(new Student(name, Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1])));
        }

        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
