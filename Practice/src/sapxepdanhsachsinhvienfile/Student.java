package sapxepdanhsachsinhvienfile;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String id;
    private String fullname;
    private String phoneNumber;
    private String email;
    private String lastName;
    private String firstName;
    private String middleName;

    public Student(String id, String fullname, String phoneNumber, String email) {
        this.id = id;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastName = getLastName();
        this.firstName = getFirstName();
        this.middleName = getMiddleName();
    }

    private String getLastName() {
        String[] tmp = fullname.split("\\s+");
        return tmp[tmp.length - 1];
    }

    private String getFirstName() {
        String[] tmp = fullname.split("\\s+");
        return tmp[0];
    }

    private String getMiddleName() {
        String[] tmp = fullname.split("\\s+");
        return String.join(" ", Arrays.copyOfRange(tmp, 1, tmp.length - 1));
    }

    @Override
    public int compareTo(Student o) {
        if(this.lastName.compareTo(o.lastName)!=0){
            return this.lastName.compareTo(o.lastName);
        }
        if(this.firstName.compareTo(o.firstName)!=0){
            return this.firstName.compareTo(o.firstName);
        }
        if(this.middleName.compareTo(o.middleName)!=0){
            return this.middleName.compareTo(o.middleName);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+fullname+" "+phoneNumber+" "+email;
    }
}
