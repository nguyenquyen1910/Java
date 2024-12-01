package J05079_lophocphan2.J05079_lophocphan;

public class Subject implements Comparable<Subject> {
    private String subId;
    private String subName;
    private String group;
    private String lecName;

    public Subject(String subId, String subName, String group, String lecName) {
        this.subId = subId;
        this.subName = subName;
        this.group = group;
        this.lecName = lecName;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    @Override
    public String toString() {
        return group+" "+lecName;
    }

    @Override
    public int compareTo(Subject o) {
        return this.group.compareTo(o.group);
    }
}
