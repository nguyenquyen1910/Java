package J05074_diemdanh1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        List<DiemDanh> listDiemDanh = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            listDiemDanh.add(new DiemDanh(tmp[0],tmp[1]));
        }

        String classQuery = sc.nextLine();

        for(DiemDanh diemDanh : listDiemDanh){
            for(SinhVien sinhVien : list){
                if(diemDanh.getStudentId().equals(sinhVien.getId())){
                    sinhVien.setDiemDanh(diemDanh);
                }
            }
        }

        for(SinhVien sinhVien : list){
            if(sinhVien.getClassName().equals(classQuery)){
                System.out.println(sinhVien);
            }
        }
    }
}
