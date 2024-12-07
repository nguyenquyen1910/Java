package danhsachlienlac;

public class Student {
    private String stuId, stuName, stuClass, email, phone;

    public Student(String stuId, String stuName, String stuClass, String email, String phone) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.email = email;
        this.phone = "0"+phone;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public String getPhone() {
        return phone;
    }
}
