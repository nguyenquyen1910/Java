package J06008_tinhgiochuanchogiaovien;

public class Time {
    private String lecId;
    private String subId;
    private double time;
    private Subject subject;
    private Lecturer lecturer;

    public Time(String lecId, String subId, double time) {
        this.lecId = lecId;
        this.subId = subId;
        this.time = time;
    }

    public String getLecId() {
        return lecId;
    }

    public String getSubId() {
        return subId;
    }

    public double getTime() {
        return time;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return subject.getName()+" "+time;
    }
}
