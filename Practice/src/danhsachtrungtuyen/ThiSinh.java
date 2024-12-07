package danhsachtrungtuyen;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma, ten;
    private double diemToan, diemLy, diemHoa;
    private double diemUuTien, tongDiem, diemChuan;
    private String trangThai;

    public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.ten = xuLyTen(ten);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemUuTien = tinhDiemUuTien();
        this.tongDiem = diemToan*2 + diemLy + diemHoa + this.diemUuTien;
    }

    private String xuLyTen(String ten) {
        String res="";
        String[] tmp = ten.split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    private double tinhDiemUuTien() {
        if(ma.startsWith("KV1")){
            return 0.5;
        }
        if(ma.startsWith("KV2")){
            return 1.0;
        }
        return 2.5;
    }

    public void setDiemChuan(double diemChuan) {
        this.diemChuan = diemChuan;
        this.trangThai = (this.tongDiem >= this.diemChuan) ? "TRUNG TUYEN" : "TRUOT";
    }

    public double getDiemChuan() {
        return diemChuan;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    private String xuLyDiem(double diem) {
        if((int) diem==diem){
            return String.format("%.0f", diem);
        }
        return String.format("%.1f", diem);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+xuLyDiem(diemUuTien)+" "+xuLyDiem(tongDiem)+" "+trangThai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongDiem != o.tongDiem) {
            return Double.compare(o.tongDiem, this.tongDiem);
        }
        return this.ma.compareTo(o.ma);
    }
}
