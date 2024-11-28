package J05025_danhsachgiangvien;

public class GiangVien implements Comparable<GiangVien> {
    private String id,firstName,name,major,specialized;

    public String getSpecialized(String s){
        String str="";
        String[] tmp=s.split("\\s+");
        for(String x : tmp){
            x=x.toUpperCase();
            str+=x.charAt(0);
        }
        return str;
    }

    public String getFirstName(String s){
        String[] tmp=s.split("\\s+");
        return tmp[tmp.length-1];
    }

    public GiangVien(int i, String name, String major) {
        this.id = "GV"+String.format("%02d",i+1);
        this.name = name;
        this.major = major;
        this.firstName=getFirstName(name);
        this.specialized = getSpecialized(major);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+specialized;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.firstName.equals(o.firstName)==false) {
            return this.firstName.compareTo(o.firstName);
        }
        return this.id.compareTo(o.id);
    }
}
