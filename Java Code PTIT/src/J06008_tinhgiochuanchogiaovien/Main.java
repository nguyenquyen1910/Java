package J06008_tinhgiochuanchogiaovien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+",2);
            subjects.add(new Subject(tmp[0],tmp[1]));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<Lecturer> lecturers = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+",2);
            lecturers.add(new Lecturer(tmp[0],tmp[1]));
        }

        int o = Integer.parseInt(sc.nextLine());
        List<Time> times = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            times.add(new Time(tmp[0],tmp[1],Double.parseDouble(tmp[2])));
        }

        for(Time time : times){
            for(Lecturer lecturer : lecturers){
                if(time.getLecId().equals(lecturer.getId())){
                    lecturer.addTime(time.getTime());
                    time.setLecturer(lecturer);
                }
            }
        }

        for(Time time : times){
            for(Subject subject : subjects){
                if(time.getSubId().equals(subject.getId())){
                    subject.addTime(time.getTime());
                    time.setSubject(subject);
                }
            }
        }

        String query = sc.nextLine();
        for(Time time : times){
            if(query.equals(time.getLecId())){
                System.out.println("Giang vien: "+time.getLecturer().getName());
                System.out.println(time.getSubject().getName()+" "+time.getSubject().getTotalTime());
                System.out.println("Tong: "+String.format("%.2f",time.getLecturer().getTotalTime()));
            }
        }
    }
}
