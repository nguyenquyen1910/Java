package chamcong;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String name;
    private String timeStart;
    private String timeEnd;
    private String status;
    private long timeOfWork;

    public NhanVien(String id, String name, String timeStart, String timeEnd) throws ParseException {
        this.id = id;
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeOfWork = solveTimeOfWork();
        if(this.timeOfWork >= 480){
            this.status = "DU";
        }
        else{
            this.status = "THIEU";
        }
    }

    private long solveTimeOfWork() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date in = sdf.parse(timeStart);
        Date out = sdf.parse(timeEnd);
        long tmp = (out.getTime() - in.getTime()) / (1000*60);
        return tmp-60;
    }


    @Override
    public String toString() {
        return id+" "+name+" "+(timeOfWork/60)+" gio "+(timeOfWork%60)+" phut "+status;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.timeOfWork != o.timeOfWork){
            return (int)(o.timeOfWork-this.timeOfWork);
        }
        return this.id.compareTo(o.id);
    }
}
