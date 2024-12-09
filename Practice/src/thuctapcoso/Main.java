package thuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("DETAI.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Topic> topics = new ArrayList<>();
        for(int i=0;i<m;i++){
            topics.add(new Topic(i, sc1.nextLine(), sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("NHIEMVU.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Mission> missions = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split(" ", 2);
            missions.add(new Mission(tmp[0], tmp[1]));
        }

        for(Mission mission : missions){
            for(Student student : students){
                if(mission.getStuId().equals(student.getStuId())){
                    mission.setStudent(student);
                    break;
                }
            }
        }

        for(Mission mission : missions){
            for(Topic topic : topics){
                if(mission.getTopicId().equals(topic.getTopicId())){
                    mission.setTopic(topic);
                    break;
                }
            }
        }

        Collections.sort(missions);
        missions.forEach(System.out::println);
    }
}
