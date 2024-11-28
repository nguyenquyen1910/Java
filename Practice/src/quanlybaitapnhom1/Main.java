package quanlybaitapnhom1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), m=sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        List<Exercise> exercises = new ArrayList<>();
        for(int i=0;i<m;i++){
            exercises.add(new Exercise(i,sc.nextLine()));
        }
        for(Student student : students){
            for(Exercise exercise : exercises){
                if(student.getExId()==exercise.getExid()){
                    student.setExercise(exercise);
                }
            }
        }
        Collections.sort(students);
        for(Student student : students){
            System.out.println(student);
        }
    }
}
