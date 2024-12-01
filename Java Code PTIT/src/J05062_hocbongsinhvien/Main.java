package J05062_hocbongsinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String[] score = sc.nextLine().split("\\s+");
            students.add(new Student(name, Double.parseDouble(score[0]), Double.parseDouble(score[1]), i));
        }
        students.sort((a, b) -> {
            if (Double.compare(b.getGpa(), a.getGpa()) != 0) {
                return Double.compare(b.getGpa(), a.getGpa());
            }
            return Double.compare(b.getTrainingScore(), a.getTrainingScore());
        });
        int i = m;
        while(i<n){
            if(students.get(i).getGpa().compareTo(students.get(i-1).getGpa()) == 0){
                ++i;
            }
            else break;
        }
        while(i<n){
            students.get(i).setStatus("KHONG");
            ++i;
        }
        for(i=0;i<n;i++){
            for(Student student : students){
                if(student.getIndex()==i){
                    System.out.println(student);
                }
            }
        }
    }
}
