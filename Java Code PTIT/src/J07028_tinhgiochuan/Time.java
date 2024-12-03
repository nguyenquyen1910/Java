package J07028_tinhgiochuan;

public class Time {
    private String lecId;
    private String subId;
    private double time;
    private Lecturer lecturer;

    public Time(String lecId, String subId, double time) {
        this.lecId = lecId;
        this.subId = subId;
        this.time = time;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public double getTime() {
        return time;
    }
}
