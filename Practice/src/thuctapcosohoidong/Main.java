package thuctapcosohoidong;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<Topic> topics = new ArrayList<>();
        for(int i=0;i<m;i++){
            topics.add(new Topic(i, sc.nextLine(), sc.nextLine()));
        }

        int o = Integer.parseInt(sc.nextLine());
        List<Council> councils = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc.nextLine().trim().split(" ", 3);
            councils.add(new Council(tmp[0], tmp[1], tmp[2]));
        }

        for(Council council : councils){
            for(Student student : students){
                if(council.getStuId().trim().equals(student.getStuId().trim())){
                    council.setStudent(student);
                    break;
                }
            }
        }

        for(Council council : councils){
            for(Topic topic : topics){
                if(council.getTopId().trim().equals(topic.getTopId().trim())){
                    council.setTopic(topic);
                    break;
                }
            }
        }

        Collections.sort(councils);
        for(int i=1;i<=8;i++){
            List<Council> tmp = new ArrayList<>();
            for(Council council : councils){
                if(council.getCouId().charAt(4)-'0' == i){
                    tmp.add(council);
                }
            }
            if(!tmp.isEmpty()){
                System.out.println("DANH SACH HOI DONG " + (i) + ":");
                Collections.sort(tmp);
                tmp.forEach(System.out::println);
            }
        }
    }
}
