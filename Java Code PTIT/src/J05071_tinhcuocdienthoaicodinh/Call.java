package J05071_tinhcuocdienthoaicodinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Call implements Comparable<Call> {
    private String phoneNumber;
    private String startTime;
    private String endTime;
    private Province province;
    private long minutes;
    private long totalAmount;

    public Call(String phoneNumber, String startTime, String endTime) throws ParseException {
        this.phoneNumber = phoneNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.minutes = solveMinutes();
    }

    public void setProvince(Province province) {
        this.province = province;
        this.totalAmount = solveTotalAmount();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private long solveMinutes() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long res = sdf.parse(endTime).getTime() - sdf.parse(startTime).getTime();
        if(!phoneNumber.startsWith("0")){
            return (long) Math.ceil((double) res /(1000*60)/3);
        }
        return (res/(1000*60));
    }

    private long solveTotalAmount() {
        if(phoneNumber.startsWith("0")){
            return minutes*province.getProPrice();
        }
        return (long) Math.ceil((double) minutes)*800;
    }

    @Override
    public String toString() {
        return phoneNumber+" "+province.getProName()+" "+ minutes+" "+totalAmount;
    }

    @Override
    public int compareTo(Call o) {
        return Long.compare(o.totalAmount,this.totalAmount);
    }
}
