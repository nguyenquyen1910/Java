package J07047_quanlikhachsan;

import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String cusId;
    private String cusName;
    private String idRoom;
    private Date checkIn;
    private Date checkOut;
    private long days;
    private double discount;
    private double price;
    private KhachSan khachSan;

    public KhachHang(int i, String cusName, String idRoom, Date checkIn, Date checkOut) {
        this.cusId = "KH" + String.format("%02d", i + 1);
        this.cusName = cusName;
        this.idRoom = idRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.days = calculateDays();
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setKhachSan(KhachSan khachSan) {
        this.khachSan = khachSan;
        this.price = calculatePrice();
        this.discount = calculateDiscount();
    }

    private long calculateDays() {
        long tmp = (this.checkOut.getTime() - this.checkIn.getTime()) / (1000L * 60 * 60 * 24);
        return Math.max(tmp, 1);
    }

    private double calculatePrice() {
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
