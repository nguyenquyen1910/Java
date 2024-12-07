package chamcongnhanhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Worker implements Comparable<Worker> {
    private String id, name, startTime, endTime;
    private long workTime;
    private String status;

    public Worker(String id, String name, String startTime, String endTime) throws ParseException {
        this.id = id;
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.startTime = sdf.format(sdf.parse(startTime));
        this.endTime = sdf.format(sdf.parse(endTime));
        this.workTime = (sdf.parse(endTime).getTime() - sdf.parse(startTime).getTime()) / (1000*60);
        this.status = (this.workTime - 60) >= (8*60) ? "DU" : "THIEU";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+(workTime-60)/60+" gio "+(workTime-60)%60+" phut "+status;
    }

    @Override
    public int compareTo(Worker o) {
        if(this.workTime != o.workTime){
            return Long.compare(o.workTime, this.workTime);
        }
        return this.id.compareTo(o.id);
    }
}
