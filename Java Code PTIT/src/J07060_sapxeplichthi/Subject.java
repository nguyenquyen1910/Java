package J07060_sapxeplichthi;

public class Subject {
    private String subId;
    private String subName;
    private String subForm;

    public Subject(String subId, String subName, String subForm) {
        this.subId = subId;
        this.subName = subName;
        this.subForm = subForm;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public String getSubForm() {
        return subForm;
    }
}
