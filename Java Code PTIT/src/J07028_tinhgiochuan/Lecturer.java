package J07028_tinhgiochuan;

public class Lecturer {
    private String lecId;
    private String lecName;
    private double totalTime;

    public Lecturer(String lecId, String lecName) {
        this.lecId = lecId;
        this.lecName = lecName;
        this.totalTime = 0.0;
    }

    public String getLecId() {
        return lecId;
    }

    public void addTime(double time) {
        this.totalTime += time;
    }

    @Override
    public String toString() {
        return lecName+" "+String.format("%.2f", totalTime);
    }
}
