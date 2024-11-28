package tinhtongsogio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<Subject> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Subject(sc.nextLine()));
        }
        Scanner sc1=new Scanner(new File("GIANGVIEN.in"));
        int m=Integer.parseInt(sc1.nextLine());
        List<Lecture> listLec=new ArrayList<>();
        for(int i=0;i<m;i++){
            listLec.add(new Lecture(sc1.nextLine()));
        }
        Scanner sc2=new Scanner(new File("GIOCHUAN.in"));
        int o=Integer.parseInt(sc2.nextLine());
        List<Time> listTime=new ArrayList<>();
        for(int i=0;i<o;i++){
            listTime.add(new Time(sc2.nextLine()));
        }

        for(Time i : listTime){
            for(Lecture le : listLec){
                if(i.getLecId().equals(le.getId())){
                    le.addTotalTime(i.getTime());
                    break;
                }
            }
        }
        for(Lecture le : listLec){
            System.out.println(le.getName()+" "+String.format("%.2f",le.getTotalTime()));
        }
    }
}

/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
 */
