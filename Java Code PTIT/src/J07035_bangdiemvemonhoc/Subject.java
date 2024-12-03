package J07035_bangdiemvemonhoc;

public class Subject {
    private String subId;
    private String subName;
    private int credit;

    public Subject(String subId, String subName, int credit) {
        this.subId = subId;
        this.subName = subName;
        this.credit = credit;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }
}
