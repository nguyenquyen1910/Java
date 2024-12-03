package J07028_tinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split(" ", 2);
            subjects.add(new Subject(tmp[0], tmp[1]));
        }

        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Lecturer> lecturers = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc1.nextLine().trim().split(" ", 2);
            lecturers.add(new Lecturer(tmp[0], tmp[1]));
        }

        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Time> times = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split(" ", 3);
            times.add(new Time(tmp[0], tmp[1], Double.parseDouble(tmp[2])));
        }

        for(Time time : times){
            for(Lecturer lecturer : lecturers){
                if(time.getLecId().equals(lecturer.getLecId())){
                    lecturer.addTime(time.getTime());
                    time.setLecturer(lecturer);
                    break;
                }
            }
        }
        lecturers.forEach(System.out::println);
    }
}
