package baocaoduan;

public class Exercise {
    private String stuId, stuName, exeName;

    public Exercise(String stuId, String stuName, String exeName) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.exeName = exeName;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public String getExeName() {
        return exeName;
    }
}