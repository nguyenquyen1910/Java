package J05033_sapxepthoigian;

import java.util.Comparator;

public class ThoiGian implements Comparable<ThoiGian> {
    private int gio,phut,giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return gio+" "+phut+" "+giay;
    }

    @Override
    public int compareTo(ThoiGian o){
        int time1=this.gio*3600+this.phut*60+this.giay;
        int time2=o.gio*3600+o.phut*60+o.giay;
        return time1-time2;
    }
}
