package xoagiangvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        List<Lecturer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Lecturer(i,sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        String idLec = sc.nextLine();
        boolean isDeleted = false;
        for(Lecturer lec : list){
            if(lec.getId().equals(idLec)){
                list.remove(lec);
                isDeleted = true;
                System.out.println("xoa thanh cong!");
                break;
            }
        }

        if(!isDeleted){
            System.out.println("khong tim thay");
        }
    }
}
/*
3
To thi Van
4.2
B
300
Vu thi Ha
3
B
700
Tran Van Ha
3.5
C
800
 */