package thuctapcoso;

public class Mission implements Comparable<Mission> {
    private String stuId, topicId;
    private Student student;
    private Topic topic;
    public Mission(String stuId, String topicId) {
        this.stuId = stuId;
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return stuId+" "+student.getStuName()+" "+student.getPhone()+" "+student.getEmail()+" "+topic.getLecName()+" "+
                topic.getTopicName();
    }

    @Override
    public int compareTo(Mission o) {
        return this.topic.getTopicName().compareTo(o.topic.getTopicName());
    }
}
