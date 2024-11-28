package J05015_duaxedap;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Player implements Comparable<Player> {
    private String id;
    private String name;
    private String address;
    private String endTime;
    private Double time;
    private Long speed;

    public Player(String name, String address, String endTime) throws ParseException {
        this.name = name;
        this.address = address;
        this.id = solveId();
        this.endTime = endTime;
        this.time = solveTime();
        this.speed = Math.round(120.0 / this.time);
    }

    private String solveId() {
        String[] tmpName = this.name.toUpperCase().split("\\s+");
        String[] tmpAddress = this.address.toUpperCase().split("\\s+");
        String res="";
        for(String it : tmpAddress){
            res+=it.charAt(0);
        }
        for(String it : tmpName){
            res+=it.charAt(0);
        }
        return res;
    }

    private Double solveTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        double time = (sdf.parse(endTime).getTime() - sdf.parse("06:00").getTime()) / 3600000.0;
        return time;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+address+" "+speed+" "+"Km/h";
    }

    @Override
    public int compareTo(Player o) {
        return this.time.compareTo(o.time);
    }
}
