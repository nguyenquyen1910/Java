package thoigianonlinelientuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(students);
        students.forEach(System.out::println);
    }
}