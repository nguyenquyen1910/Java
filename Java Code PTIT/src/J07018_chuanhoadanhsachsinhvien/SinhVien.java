package J07018_chuanhoadanhsachsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id;
    private String name;
    private String className;
    private String dateOfBirth;
    private Double gpa;

    public SinhVien(int i, String name, String className,String dateOfBirth, Double gpa) throws ParseException {
        this.id = "B20DCCN"+String.format("%03d",i+1);
        this.name = handleName(name);
        this.className = className;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = sdf.format(sdf.parse(dateOfBirth));
        this.gpa = gpa;
    }

    private String handleName(String name) {
        String[] words = name.trim().split("\\s+");
        String res = "";
        for (String word : words) {
            res += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+dateOfBirth+" "+String.format("%.2f",gpa);
    }
}
