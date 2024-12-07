package sapxepmonhoc;

public class Subject implements Comparable<Subject> {
    private String subId, subName;
    private int credit;

    public Subject(String subId, String subName, int credit) {
        this.subId = subId;
        this.subName = subName;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return subId+" "+subName+" "+credit;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subName.compareTo(o.subName);
    }
}
