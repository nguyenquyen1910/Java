package danhsachsinhviendoan;

public class Student implements Comparable<Student> {
    private String id, name, classname, email, phone;

    public Student(String id, String name, String classname, String email, String phone) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.email = email;
        this.phone = "0" + phone;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+classname+" "+email+" "+phone;
    }

    @Override
    public int compareTo(Student o) {
        if(!this.classname.equals(o.classname)){
            return this.classname.compareTo(o.classname);
        }
        return this.id.compareTo(o.id);
    }
}
