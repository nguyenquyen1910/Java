package TN02012_tinhluong;

public class PhongBan {
    private String roomId;
    private String roomName;

    public PhongBan(String roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }
}
