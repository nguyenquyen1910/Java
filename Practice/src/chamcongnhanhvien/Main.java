package chamcongnhanhvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Worker> workers = new ArrayList<>();
        for(int i=0;i<n;i++){
            workers.add(new Worker(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(workers);
        workers.forEach(System.out::println);
    }
}
