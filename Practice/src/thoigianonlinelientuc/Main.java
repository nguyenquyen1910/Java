package thoigianonlinelientuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for(int i=0;i<n;i++){
            list.add(new Student(sc.nextLine(),sdf.parse(sc.nextLine()),sdf.parse(sc.nextLine())));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}