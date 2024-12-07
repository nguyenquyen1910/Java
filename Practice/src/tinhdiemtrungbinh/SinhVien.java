package tinhdiemtrungbinh;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten;
    private double diemC, diemCpp, diemOop;
    private double diemTrungBinh;
    private int rank;

    public SinhVien(int i, String ten, double diemOop, double diemCpp, double diemC) {
        this.ma = "SV"+String.format("%02d", i+1);
        this.ten = xuLyTen(ten);
        this.diemC = diemC;
        this.diemCpp = diemCpp;
        this.diemOop = diemOop;
        this.diemTrungBinh = (3*diemOop + 3*diemCpp + 2*diemC) / 8.0;
    }

    private String xuLyTen(String name){
        String[] tmp = name.split("\\s+");
        String res="";
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.2f", diemTrungBinh)+" "+rank;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.diemTrungBinh != o.diemTrungBinh){
            return Double.compare(o.diemTrungBinh, this.diemTrungBinh);
        }
        return this.ma.compareTo(o.ma);
    }
}
