package J05024_lietketheonganh;

import java.util.*;

public class Main {
    public static String majorRemake(String major){
        String[] tmp = major.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            res.append(x.toUpperCase()).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            list.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Map<String,String> mp = new HashMap<>();
        mp.put("Ke toan", "DCKT");
        mp.put("Cong nghe thong tin", "DCCN");
        mp.put("An toan thong tin", "DCAT");
        mp.put("Vien thong", "DCVT");
        mp.put("Dien tu", "DCDT");
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String major = sc.nextLine();
            String s = mp.get(major);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", major.toUpperCase());
            list.forEach(e -> {
                if(s.compareTo("DCCN") == 0 || s.compareTo("DCAT") == 0){
                    if(e.getId().indexOf(s) > -1 && !e.getClassName().startsWith("E")) System.out.println(e);
                }else{
                    if(e.getId().indexOf(s) > -1) System.out.println(e);
                }
            });
        }
    }
}
