package bangtinhgiochuan;

public class AssignTime {
    private String lecId;
    private String subId;
    private Double time;
    private Lecturer lecturer;
    public AssignTime(String lecId, String subId, Double time) {
        this.lecId = lecId;
        this.subId = subId;
        this.time = time;
    }

    public String getSubId() {
        return subId;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
        lecturer.addTotalTime(time);
    }
}
