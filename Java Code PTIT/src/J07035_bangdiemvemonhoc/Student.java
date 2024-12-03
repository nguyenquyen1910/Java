package J07035_bangdiemvemonhoc;

public class Student {
    private String stuId;
    private String stuName;
    private String stuClass;
    private String stuEmail;

    public Student(String stuId, String stuName, String stuClass, String stuEmail) {
        this.stuId = stuId;
        this.stuName = formatName(stuName);
        this.stuClass = stuClass;
        this.stuEmail = stuEmail;
    }

    private String formatName(String name) {
        String[] tmp = name.trim().split("\\s+");
        String res="";
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuClass() {
        return stuClass;
    }

    public String getStuName() {
        return stuName;
    }
}
