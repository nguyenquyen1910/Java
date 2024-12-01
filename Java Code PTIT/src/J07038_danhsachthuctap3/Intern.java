package J07038_danhsachthuctap3;

public class Intern implements Comparable<Intern> {
    private String stuId;
    private String busId;
    private Student student;
    private Business business;

    public Intern(String stuId, String busId) {
        this.stuId = stuId;
        this.busId = busId;
    }

    public String getBusId() {
        return busId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Business getBusiness() {
        return business;
    }

    @Override
    public String toString() {
        return stuId+" "+student.getStuName()+" "+student.getStuClass();
    }

    @Override
    public int compareTo(Intern o) {
        return this.stuId.compareTo(o.getStuId());
    }
}
