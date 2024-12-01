package J07038_danhsachthuctap3;

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
        Scanner sc1 = new Scanner(new File("DN.in"));
        int m = Integer.parseInt(sc1.nextLine());
        List<Business> businesses = new ArrayList<>();
        for(int i=0;i<m;i++){
            businesses.add(new Business(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine())));
        }
        Scanner sc2 = new Scanner(new File("THUCTAP.in"));
        int o = Integer.parseInt(sc2.nextLine());
        List<Intern> interns = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = sc2.nextLine().trim().split("\\s+");
            interns.add(new Intern(tmp[0], tmp[1]));
        }

        for(Intern intern : interns){
            for(Student student : students){
                if(intern.getStuId().equals(student.getStuId())){
                    intern.setStudent(student);
                }
            }
        }
        for(Intern intern : interns){
            for(Business business : businesses){
                if(intern.getBusId().equals(business.getBusId())){
                    intern.setBusiness(business);
                }
            }
        }

        Collections.sort(interns);

        int q = Integer.parseInt(sc2.nextLine());
        while(q-->0){
            String query = sc2.nextLine();
            String tmp = "";
            List<Intern> res = new ArrayList<>();
            for(Intern intern : interns){
                if(intern.getBusId().equals(query)){
                    tmp = intern.getBusiness().getBusName();
                    if(res.size() < intern.getBusiness().getTarget()){
                        res.add(intern);
                    }
                }
            }
            System.out.println("DANH SACH THUC TAP TAI "+tmp+":");
            res.forEach(System.out::println);
        }
    }
}
