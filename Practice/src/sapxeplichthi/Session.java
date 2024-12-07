package sapxeplichthi;

public class Session {
    private String sesId, date, time, roomId;

    public Session(int i, String date, String time, String roomId) {
        this.sesId = "C"+String.format("%03d", i+1);
        this.date = date;
        this.time = time;
        this.roomId = roomId;
    }

    public String getSesId() {
        return sesId;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getRoomId() {
        return roomId;
    }
}
