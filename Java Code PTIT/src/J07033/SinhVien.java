package J07033;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV,tenSV,lop,email;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        this.tenSV = formatName(tenSV);
        this.lop = lop;
        this.email = email;
    }

    private String formatName(String name) {
        String res="";
        String[] tmp = name.trim().split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return maSV+" "+tenSV+" "+lop+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }
}
