package J05054_xephanghocsinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            Student student = new Student(i, sc.nextLine(),Double.parseDouble(sc.nextLine()));
            students.add(student);
        }
        List<Student> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents);
        int rank = 1;
        for (int i = 0; i < sortedStudents.size(); i++) {
            if (i > 0 && sortedStudents.get(i).getScore().equals(sortedStudents.get(i - 1).getScore())) {
                sortedStudents.get(i).setRank(sortedStudents.get(i - 1).getRank());
            } else {
                sortedStudents.get(i).setRank(rank);
            }
            rank++;
        }
        students.forEach(System.out::println);
    }
}
