package xemphim;

public class ThongTinPhim implements Comparable<ThongTinPhim> {
    private String id,typeId,date,name;
    private int cnt;
    private TheLoai theLoai;

    public ThongTinPhim(int i,String typeId, String date, String name, int cnt) {
        this.id="P"+String.format("%03d",i+1);
        this.typeId = typeId;
        this.date = date;
        this.name = name;
        this.cnt = cnt;
    }

    public String getTypeId() {
        return typeId;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return id+" "+theLoai.getName()+" "+date+" "+name+" "+cnt;
    }

    @Override
    public int compareTo(ThongTinPhim o) {
        if(this.date.equals(o.date)){
            return o.date.compareTo(this.date);
        }
        if(this.name.equals(o.name)){
            return o.name.compareTo(this.name);
        }
        return this.cnt-o.cnt;
    }
}
