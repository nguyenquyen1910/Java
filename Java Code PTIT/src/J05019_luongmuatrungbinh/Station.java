package J05019_luongmuatrungbinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Station {
    private String id;
    private String name;
    private long totalMinutes;
    private long totalRains;
    private double averageRains;

    public Station(int i, String name) {
        this.id = "T"+String.format("%02d", i+1);
        this.name = name;
        this.totalMinutes = 0;
        this.totalRains = 0;
        this.averageRains = 0;
    }

    public void addRain(String startTime, String endTime, long total) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        try {
            long start = sdf.parse(startTime).getTime();
            long end = sdf.parse(endTime).getTime();
            this.totalMinutes += (end-start)/1000/60;
        } catch (ParseException parseException){

        }
        this.totalRains += total;
        this.averageRains = (double) this.totalRains / ((this.totalMinutes) / 60.0);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f", averageRains);
    }
}
