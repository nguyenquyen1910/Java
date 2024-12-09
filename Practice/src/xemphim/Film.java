package xemphim;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Film implements Comparable<Film> {
    private String typeId,filmId, filmName, day;
    private int unit;
    private long times;
    private Type type;

    public Film(int i, String typeId, String day, String filmName, int unit) throws ParseException {
        this.filmId = "P"+String.format("%03d", i+1);
        this.typeId = typeId;
        this.filmName = filmName;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.day = sdf.format(sdf.parse(day));
        this.times = sdf.parse(this.day).getTime();
        this.unit = unit;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return filmId+" "+type.getTypeName()+" "+day+" "+filmName+" "+unit;
    }

    @Override
    public int compareTo(Film o) {
        if(this.times != o.times){
            return Long.compare(this.times, o.times);
        }
        if(!this.filmName.equals(o.filmName)){
            return this.filmName.compareTo(o.filmName);
        }
        return o.unit - this.unit;
    }
}
