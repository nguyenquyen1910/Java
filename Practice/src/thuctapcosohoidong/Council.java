package thuctapcosohoidong;

public class Council implements Comparable<Council> {
    private String stuId, topId, couId;
    private Student student;
    private Topic topic;

    public Council(String stuId, String topId, String couId) {
        this.stuId = stuId;
        this.topId = topId;
        this.couId = couId;
    }

    public String getTopId() {
        return topId;
    }

    public String getStuId() {
        return stuId;
    }

    public String getCouId() {
        return couId;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return stuId+" "+student.getStuName()+" "+topic.getTopName()+" "+topic.getLecName();
    }

    @Override
    public int compareTo(Council o) {
        return this.stuId.compareTo(o.getStuId());
    }
}
