package J05011_tinhgio;

public class TimePlay implements Comparable<TimePlay> {
    private String id,name,timeIn,timeOut;
    private int timePlay;

    public TimePlay(String id, String name, String timeIn, String timeOut) {
        this.id = id;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.timePlay = 60*Integer.parseInt(timeOut.substring(0,2))+Integer.parseInt(timeOut.substring(3))
        -60*Integer.parseInt(timeIn.substring(0,2))-Integer.parseInt(timeIn.substring(3));
    }

    @Override
    public int compareTo(TimePlay o) {
        return o.timePlay-this.timePlay;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%d gio %d phut",timePlay/60,timePlay%60);
    }
}
