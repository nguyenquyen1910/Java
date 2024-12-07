package sapxeplichthi;

public class Subject {
    private String subId, subName, subType;

    public Subject(String subId, String subName, String subType) {
        this.subId = subId;
        this.subName = subName;
        this.subType = subType;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public String getSubType() {
        return subType;
    }
}
