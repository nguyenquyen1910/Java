package TN02012_tinhluong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<PhongBan> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String roomName = "";
            for(int j=1;j<tmp.length;j++){
                roomName+=tmp[j]+" ";
            }
            list.add(new PhongBan(tmp[0],roomName.trim()));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<NhanVien> list2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            list2.add(new NhanVien(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }

        for(NhanVien nv : list2){
            for(PhongBan pb : list){
                if(nv.getCusId().substring(3).equals(pb.getRoomId())){
                    nv.setPhongBan(pb);
                }
            }
        }

        for(NhanVien nv : list2){
            System.out.println(nv);
        }
    }
}
