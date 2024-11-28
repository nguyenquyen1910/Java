package phuongtiengiaothong;
import java.util.Date;
import java.util.Scanner;

interface IPTGT{
    double getGiaBan();
}

class PTGT {
    String ma,hang;
    String ngayLanBanh;
    double giaGoc;
    int sMa;

    public PTGT(){
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }
}

class Oto extends PTGT implements IPTGT{
    String soCho;
    public static int maSo=1;

    public Oto(){
    }

    public void nhap(Scanner sc){
        hang = sc.nextLine();
        ma = Character.toUpperCase(hang.charAt(0)) + "00" +maSo;
        maSo+=1;
        soCho=sc.nextLine();
        ngayLanBanh=sc.nextLine();
        giaGoc = Double.parseDouble(sc.nextLine());
    }

    public int getYear(){
        return (ngayLanBanh.charAt(6)-'0')*1000+(ngayLanBanh.charAt(7)-'0')*100+(ngayLanBanh.charAt(8)-'0')*10+(ngayLanBanh.charAt(9)-'0');
    }

    @Override
    public double getGiaBan() {
        int year = getYear();
        if(year==2024 || year==2023){
            return giaGoc*1.1;
        }
        if(year==2020 || year==2021 || year==2022){
            return giaGoc*0.9;
        }
        return giaGoc*0.8;
    }

    @Override
    public String toString() {
        return ma+" "+hang+" "+getYear()+" "+soCho+" "+(int)getGiaBan();
    }
}

public class PhuongTien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PTGT pt = new Oto();
        ((Oto) pt).nhap(in);
        System.out.println(pt);
        ((Oto) pt).nhap(in);
        System.out.println(pt);
    }
}
