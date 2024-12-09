package thuctapcosohoidong;

public class Student {
    private String stuId, stuName, phone, email;

    public Student(String stuId, String stuName, String phone, String email) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.phone = phone;
        this.email = email;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
