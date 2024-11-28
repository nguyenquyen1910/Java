package bangtinhgiochuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            String info = sc.nextLine();
            subjects.add(new Subject(info.substring(0,7),info.substring(8)));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Lecturer> lecturers = new ArrayList<>();
        for(int i=0;i<m;i++){
            String info = sc.nextLine();
            lecturers.add(new Lecturer(info.substring(0,4),info.substring(5)));
        }
        int o=Integer.parseInt(sc.nextLine());
        List<AssignTime> assignTimes = new ArrayList<>();
        for(int i=0;i<o;i++){
            String info = sc.nextLine();
            assignTimes.add(new AssignTime(info.substring(0,4),info.substring(5,12),Double.parseDouble(info.substring(13))));
        }

        for(AssignTime assignTime : assignTimes){
            for(Lecturer lecturer : lecturers){
                if(assignTime.getLecId().equals(lecturer.getLecId())){
                    assignTime.setLecturer(lecturer);
                    break;
                }
            }
        }
        for(Lecturer lecturer : lecturers){
            System.out.println(lecturer);
        }
    }
}
