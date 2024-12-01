package J05079_lophocphan;

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

    public String getLecName() {
        return lecName;
    }

    @Override
    public String toString() {
        return subId+" "+subName+" "+group;
    }

    @Override
    public int compareTo(Subject o) {
        if(!this.subId.equals(o.subId)){
            return this.subId.compareTo(o.subId);
        }
        return this.group.compareTo(o.group);
    }
}
