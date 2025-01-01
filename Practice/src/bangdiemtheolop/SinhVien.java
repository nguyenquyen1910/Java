package bangdiemtheolop;

public class SinhVien {
    private String maSV, tenSV, lop, email;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        this.tenSV = xuLyTen(tenSV);
        this.lop = lop;
        this.email = email;
    }

    private String xuLyTen(String name) {
        String[] tmp = name.trim().split("\\s+");
        String res="";
        for(String it : tmp) {
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLop() {
        return lop;
    }
}
