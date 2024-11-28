package J07051_tinhtienphong;

import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String cusId;
    private String cusName;
    private String roomId;
    private Date checkIn;
    private Date checkOut;
    private Long days;
    private int price;
    private int fee;

    public KhachHang(int i, String cusName, String roomId, Date checkIn, Date checkOut, int fee) {
        this.cusId = "KH"+String.format("%02d",i+1);
        this.cusName = normalizeName(cusName);
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.days = (this.checkOut.getTime()-this.checkIn.getTime()) / (1000L * 60 *60 * 24) + 1;
        this.fee = fee;
        this.price=solvePrice();
    }

    private String normalizeName(String s) {
        String[] words = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i != words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public int solvePrice(){
        int res=fee;
        if(Integer.parseInt(roomId)>=400){
            res+=80*days;
        }
        else if(Integer.parseInt(roomId)>=300){
            res+=50*days;
        }
        else if(Integer.parseInt(roomId)>=200){
            res+=34*days;
        }
        else if(Integer.parseInt(roomId)>=100){
            res+=25*days;
        }
        return res;
    }

    @Override
    public String toString() {
        return cusId+" "+cusName+" "+roomId+" "+days+" "+price;
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.price-this.price;
    }
}
