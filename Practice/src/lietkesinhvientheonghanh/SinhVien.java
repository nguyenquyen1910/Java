package lietkesinhvientheonghanh;

public class SinhVien {
    private String ma, ten, lop, email;
    private String nganh;

    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.nganh = timNganhHoc();
    }

    private String timNganhHoc() {
        if(ma.contains("DCKT")) {
            return "ke toan";
        }
        if(ma.contains("DCCN") && !lop.startsWith("E")) {
            return "cong nghe thong tin";
        }
        if(ma.contains("DCAT") && !lop.startsWith("E")) {
            return "an toan thong tin";
        }
        if(ma.contains("DCVT")) {
            return "vien thong";
        }
        if(ma.contains("DCDT")) {
            return "dien tu";
        }
        return "";
    }

    public String getNganh() {
        return nganh;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+email;
    }
}
