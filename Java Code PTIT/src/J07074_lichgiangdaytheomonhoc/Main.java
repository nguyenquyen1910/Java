package J07074_lichgiangdaytheomonhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            subjects.add(new Subject(sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim())));
        }
        Scanner sc1 = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc1.nextLine().trim());
        List<Schedule> schedules = new ArrayList<>();
        for(int i=0;i<m;i++){
            schedules.add(new Schedule(i, sc1.nextLine().trim(), sc1.nextLine().trim(), Integer.parseInt(sc1.nextLine().trim()), sc1.nextLine().trim(), sc1.nextLine().trim()));
        }

        for(Schedule schedule : schedules){
            for(Subject subject : subjects){
                if(schedule.getSubId().equals(subject.getSubId())){
                    schedule.setSubject(subject);
                    break;
                }
            }
        }

        Collections.sort(schedules);
        String query = sc1.nextLine().trim();
        System.out.println("LICH GIANG DAY GIANG VIEN "+query+":");
        schedules.forEach(e -> {
            if(e.getLecName().trim().equals(query)){
                System.out.println(e);
            }
        });
    }
}
