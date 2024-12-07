package danhsachlienlac;

public class Tutorial implements Comparable<Tutorial> {
    private String stuId;
    private String exeName;
    private String lecName;
    private Student student;

    public Tutorial(String stuId, String exeName, String lecName) {
        this.stuId = stuId;
        this.exeName = exeName;
        this.lecName = lecName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return stuId+" "+student.getStuName()+" "+lecName+" "+exeName+" "+student.getPhone();
    }

    @Override
    public int compareTo(Tutorial o) {
        return this.stuId.compareTo(o.getStuId());
    }
}
