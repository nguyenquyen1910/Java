package thuctapcosohoidong;

public class Topic {
    private String topId, lecName, topName;

    public Topic(int i, String lecName, String topName) {
        this.topId = "CD"+String.format("%03d", i+1);
        this.lecName = lecName;
        this.topName = topName;
    }

    public String getTopId() {
        return topId;
    }

    public String getLecName() {
        return lecName;
    }

    public String getTopName() {
        return topName;
    }
}
