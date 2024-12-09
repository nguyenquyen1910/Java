package lietkenhanvientheonhom;

public class NhanVien implements Comparable<NhanVien> {
    private String ma, ten;
    private String chucVu, heSoLuong, soHieuNhanVien;

    public NhanVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.chucVu = ma.substring(0,2);
        this.heSoLuong = ma.substring(2, 4);
        this.soHieuNhanVien = ma.substring(4, 7);
    }

    public String getMa() {
        return ma;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }


    @Override
    public int compareTo(NhanVien o) {
        if(!this.heSoLuong.equals(o.heSoLuong)){
            return o.heSoLuong.compareTo(this.heSoLuong);
        }
        return this.soHieuNhanVien.compareTo(o.soHieuNhanVien);
    }

    @Override
    public String toString() {
        return ten+" "+chucVu+" "+soHieuNhanVien+" "+heSoLuong;
    }
}
