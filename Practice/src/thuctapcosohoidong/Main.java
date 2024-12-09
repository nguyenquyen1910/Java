package thuctapcosohoidong;

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

        Scanner sc2 = new Scanner(new File("HOIDONG.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Council> councils = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split(" ", 3);
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


        List<List<Council>> res = new ArrayList<>();
        for(int i=1;i<=8;i++){
            List<Council> tmp = new ArrayList<>();
            for(Council council : councils){
                if(council.getCouId().charAt(2)-'0' == i){
                    tmp.add(council);
                }
            }
            if(!tmp.isEmpty()){
                Collections.sort(tmp);
                res.add(tmp);
            }
        }

        for(int i=0;i<res.size();i++){
            System.out.println("DANH SACH HOI DONG " + (i + 1) + ":");
            for(Council council : res.get(i)){
                System.out.println(council);
            }
        }
    }
}
