package J05027_timkiemgiangvien;

public class GiangVien {
    private String id,name,major,nameLower,specialist;

    public String getNameLower(String name){
        String res="";
        String[] tmp=name.split("\\s+");
        for(String x : tmp){
            res+=x.toLowerCase()+" ";
        }
        return res.trim();
    }

    public String getSpecialist(String major){
        String[] tmp=major.split("\\s+");
        String res="";
        for(String x : tmp){
            x=x.toUpperCase();
            res+=x.charAt(0);
        }
        return res;
    }

    public GiangVien(int i, String name, String major) {
        this.id = "GV"+String.format("%02d",i+1);
        this.name = name;
        this.major = major;
        this.nameLower = getNameLower(name);
        this.specialist=getSpecialist(major);
    }

    public String getNameLower(){
        return nameLower;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+specialist;
    }
}
