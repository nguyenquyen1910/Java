package J07047_quanlikhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String cusId;
    private String cusName;
    private String idRoom;
    private String checkIn;
    private String checkOut;
    private long days;
    private double discount;
    private double price;
    private KhachSan khachSan;

    public KhachHang(int i, String cusName, String idRoom, String checkIn, String checkOut) throws ParseException {
        this.cusId = "KH" + String.format("%02d", i + 1);
        this.cusName = cusName;
        this.idRoom = idRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.days = (sdf.parse(checkOut).getTime() - sdf.parse(checkIn).getTime())/1000/3600/24;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setKhachSan(KhachSan khachSan) {
        this.khachSan = khachSan;
        this.price = calculatePrice();
        this.discount = calculateDiscount();
    }

    private double calculatePrice() {
        if(this.days==0){
            return (khachSan.getPrice() + khachSan.getPrice() * khachSan.getFee()) * 1;
        }
        return (khachSan.getPrice() + khachSan.getPrice() * khachSan.getFee()) * days;
    }

    private double calculateDiscount() {
        double res = 0;
        if (days >= 10 && days < 20) {
            res = price * 0.02;
        } else if (days >= 20 && days < 30) {
            res = price * 0.04;
        } else if (days >= 30) {
            res = price * 0.06;
        }
        return res;
    }

    @Override
    public String toString() {
        return cusId + " " + cusName + " " + idRoom + " " + days + " " + String.format("%.2f", (price - discount));
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.days, this.days);
    }
}
