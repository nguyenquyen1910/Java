package J07046_danhsachluutru;

import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String id;
    private String name;
    private String roomId;
    private Date checkIn;
    private Date checkOut;
    private Long days;

    public KhachHang(int i, String name, String roomId, Date checkIn, Date checkOut) {
        this.id = "KH"+String.format("%02d",i+1);
        this.name = name;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.days = (this.checkOut.getTime()-this.checkIn.getTime()) / (1000L * 60 *60 * 24);
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.days.compareTo(this.days);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+roomId+" "+days;
    }
}
