package J06007_bangtinhgio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Subject> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Subject(sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        List<Lecturer> listLec=new ArrayList<>();
        for(int i=0;i<m;i++){
            listLec.add(new Lecturer(sc.nextLine()));
        }
        int o=Integer.parseInt(sc.nextLine());
        List<Time> listTime=new ArrayList<>();
        for(int i=0;i<o;i++){
            listTime.add(new Time(sc.nextLine()));
        }

        for(Time i : listTime){
            for(Lecturer le : listLec){
                if(i.getLecId().equals(le.getId())){
                    le.addTotalTime(i.getTime());
                    break;
                }
            }
        }
        for(Lecturer le : listLec){
            System.out.println(le.getName()+" "+String.format("%.2f",le.getTotalTime()));
        }
    }
}
