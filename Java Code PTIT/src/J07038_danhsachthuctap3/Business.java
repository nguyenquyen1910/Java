package J07038_danhsachthuctap3;

public class Business {
    private String busId;
    private String busName;
    private int target;

    public Business(String busId, String busName, int target) {
        this.busId = busId;
        this.busName = busName;
        this.target = target;
    }

    public String getBusId() {
        return busId;
    }

    public String getBusName() {
        return busName;
    }

    public int getTarget() {
        return target;
    }
}
