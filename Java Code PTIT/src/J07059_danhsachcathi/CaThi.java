package J07059_danhsachcathi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CaThi implements Comparable<CaThi> {
    private String id;
    private String day;
    private String time;
    private String roomId;

    public CaThi(int i, String day, String time, String roomId) {
        this.id = "C"+String.format("%03d", i+1);
        this.day = day;
        this.time = time;
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return id+" "+day+" "+time+" "+roomId;
    }


    @Override
    public int compareTo(CaThi o) {
        LocalDate ld1 = LocalDate.parse(this.day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ld2 = LocalDate.parse(o.day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int dateCompare = ld1.compareTo(ld2);
        if (dateCompare != 0) {
            return dateCompare;
        }
        LocalTime lt1 = LocalTime.parse(this.time, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime lt2 = LocalTime.parse(o.time, DateTimeFormatter.ofPattern("HH:mm"));
        int timeCompare = lt1.compareTo(lt2);
        if(timeCompare != 0) {
            return timeCompare;
        }
        return this.id.compareTo(o.id);
    }
}
