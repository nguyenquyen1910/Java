/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timkiemnhanvientheoten;

/**
 *
 * @author PC
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten;
    private String chucVu, heSoLuong, soHieuNhanVien;
    private int bacLuong;
    
    public NhanVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.chucVu = ma.substring(0,2);
        this.heSoLuong = ma.substring(2,4);
        this.soHieuNhanVien = ma.substring(4,7);
        int stt = Integer.parseInt(this.soHieuNhanVien);
        this.bacLuong = Integer.parseInt(this.heSoLuong);
        if(this.chucVu.equals("GD") && stt>1) this.chucVu = "NV";
        else if(this.chucVu.equals("TP") || this.chucVu.equals("PP")){
            if(stt>3){
                this.chucVu = "NV";
            }
        }
    }

    public String getTen() {
        return ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    

    @Override
    public String toString() {
        return ten+" "+chucVu+" "+soHieuNhanVien+" "+heSoLuong;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.bacLuong!=o.bacLuong){
            return o.bacLuong - this.bacLuong;
        }
        return this.soHieuNhanVien.compareTo(o.soHieuNhanVien);
    }
    
    
    
}
