package tinhngayhethanbaohanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang> {
    private String maKH, tenKH, diaChi, maSP;
    private long soLuong;
    private String ngayMua;
    private SanPham sanPham;
    private long tongTien;
    private String ngayHetHan;

    public KhachHang(int i, String tenKH, String diaChi, String maSP, long soLuong, String ngayMua) throws ParseException {
        this.maKH = "KH"+String.format("%02d", i+1);
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayMua = sdf.format(sdf.parse(ngayMua));
    }

    public String getMaSP() {
        return maSP;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
        this.tongTien = sanPham.getGiaBan() * soLuong;
        this.ngayHetHan = xuLyNgayHetHan();
    }

    private String xuLyNgayHetHan() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(ngayMua, dtf);
        return localDate.plusMonths(sanPham.getThoiGian()).format(dtf);
    }


    @Override
    public int compareTo(KhachHang o) {
        if(!this.ngayHetHan.equals(o.ngayHetHan)){
            LocalDate thisNgay = LocalDate.parse(this.ngayHetHan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate oNgay = LocalDate.parse(o.ngayHetHan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return thisNgay.compareTo(oNgay);
        }
        return this.maKH.compareTo(o.maKH);
    }

    @Override
    public String toString() {
        return maKH+" "+tenKH+" "+diaChi+" "+maSP+" "+tongTien+" "+ngayHetHan;
    }
}
