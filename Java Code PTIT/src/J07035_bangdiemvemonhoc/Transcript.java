package J07035_bangdiemvemonhoc;

public class Transcript implements Comparable<Transcript> {
    private String stuId;
    private String subId;
    private String point;
    private Subject subject;
    private Student student;

    public Transcript(String stuId, String subId, String point) {
        this.stuId = stuId;
        this.subId = subId;
        this.point = point;
    }

    public String getSubId() {
        return subId;
    }

    public String getStuId() {
        return stuId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int compareTo(Transcript o) {
        if(!this.subId.equals(o.subId)){
            return this.subId.compareTo(o.subId);
        }
        return this.stuId.compareTo(o.stuId);
    }

    @Override
    public String toString() {
        return student.getStuId()+" "+student.getStuName()+" "+subject.getSubId()+" "+subject.getSubName()+" "+point;
    }
}
