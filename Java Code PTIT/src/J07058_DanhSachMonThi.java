import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Subject implements Comparable<Subject>{
    private String id,name,format;

    public Subject(String format, String id, String name) {
        this.format = format;
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    @Override
    public int compareTo(Subject o) {
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString() {
        return id+" "+name+" "+format;
    }
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<Subject> a=new ArrayList<Subject>();
        for(int i=0;i<n;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String format=sc.nextLine();
            a.add(new Subject(format,id,name));
        }
        Collections.sort(a);
        for(Subject s:a){
            System.out.println(s);
        }
    }
}
