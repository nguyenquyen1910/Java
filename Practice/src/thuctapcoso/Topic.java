package thuctapcoso;

public class Topic {
    private String topicId, lecName, topicName;
    public Topic(int i, String lecName, String topicName) {
        this.topicId = "DT"+String.format("%03d", i+1);
        this.lecName = lecName;
        this.topicName = topicName;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getLecName() {
        return lecName;
    }

    public String getTopicName() {
        return topicName;
    }
}
