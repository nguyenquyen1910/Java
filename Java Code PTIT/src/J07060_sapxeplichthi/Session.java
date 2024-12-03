package J07060_sapxeplichthi;

public class Session {
    private String sesId;
    private String day;
    private String time;
    private String room;

    public Session(int i, String day, String time, String room) {
        this.sesId = "C"+String.format("%03d", i+1);
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public String getSesId() {
        return sesId;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }
}
