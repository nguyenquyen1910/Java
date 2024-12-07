package danhsachmonhoc;

public class Subject implements Comparable<Subject> {
    private String subId, subName, subType;

    public Subject(String subId, String subName, String subType) {
        this.subId = subId;
        this.subName = subName;
        this.subType = subType;
    }

    public String getSubId() {
        return subId;
    }

    @Override
    public String toString() {
        return subId+" "+subName+" "+subType;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subId.compareTo(o.subId);
    }
}
