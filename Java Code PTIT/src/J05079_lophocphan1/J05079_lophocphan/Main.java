package J05079_lophocphan2.J05079_lophocphan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i=0;i<n;i++){
            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(subjects);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            List<Subject> res = new ArrayList<>();
            String query = sc.nextLine();
            String tmp = "";
            for(Subject s : subjects){
                if(query.equals(s.getSubId())){
                    tmp=s.getSubName();
                    res.add(s);
                }
            }
            System.out.println("Danh sach nhom lop mon "+tmp+":");
            for(Subject s : res){
                System.out.println(s);
            }
        }
    }
}
