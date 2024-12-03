package J07035_bangdiemvemonhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scSV = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scSV.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(scSV.nextLine().trim(), scSV.nextLine().trim(), scSV.nextLine().trim(), scSV.nextLine().trim()));
        }

        Scanner scSub = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(scSub.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<m;i++){
            subjects.add(new Subject(scSub.nextLine().trim(), scSub.nextLine().trim(), Integer.parseInt(scSub.nextLine().trim())));
        }

        Scanner scTran = new Scanner(new File("BANGDIEM.in"));
        int o = Integer.parseInt(scTran.nextLine());
        List<Transcript> transcripts = new ArrayList<>();
        for(int i=0;i<o;i++){
            String[] tmp = scTran.nextLine().trim().split(" ", 3);
            transcripts.add(new Transcript(tmp[0], tmp[1], tmp[2]));
        }

        for(Transcript transcript : transcripts){
            for(Student student : students){
                if(transcript.getStuId().equals(student.getStuId())){
                    transcript.setStudent(student);
                    break;
                }
            }
        }

        for(Transcript transcript : transcripts){
            for(Subject subject : subjects){
                if(transcript.getSubId().equals(subject.getSubId())){
                    transcript.setSubject(subject);
                    break;
                }
            }
        }

        Collections.sort(transcripts);

        int q = Integer.parseInt(scTran.nextLine());
        while(q-->0) {
            String query = scTran.nextLine().trim();
            List<Transcript> res = new ArrayList<>();
            for(Transcript transcript : transcripts){
                if(transcript.getStudent().getStuClass().equals(query)){
                    res.add(transcript);
                }
            }
            System.out.println("BANG DIEM lop "+query+":");
            res.forEach(System.out::println);
        }
    }
}
