package J05016_hoadonkhachsan;

import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String id;
    private String name;
    private String roomId;
    private Date checkIn;
    private Date checkOut;
    private int fee;
    private Long days;
    private int totalFee;

    public KhachHang(int i, String name, String roomId, Date checkIn, Date checkOut,int fee) {
        this.id = "KH"+String.format("%02d",i+1);
        this.name = name;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fee = fee;
        this.days = (this.checkOut.getTime()-this.checkIn.getTime()) / (1000L * 60 *60 * 24)+1;
        this.totalFee = solveTotalFee();
    }

    public int solveTotalFee(){
        int res=0;
        if(roomId.charAt(0)=='1'){
            res+=25*days+fee;
        }
        else if(roomId.charAt(0)=='2'){
            res+=34*days+fee;
        }
        else if(roomId.charAt(0)=='3'){
            res+=50*days+fee;
        }
        else if(roomId.charAt(0)=='4'){
            res+=80*days+fee;
        }
        return res;
    }


    @Override
    public int compareTo(KhachHang o) {
        return o.totalFee-this.totalFee;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+roomId+" "+days+" "+totalFee;
    }
}
