package duaxedap;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Player implements Comparable<Player> {
    private String id, name, address, timeEnd;
    private double time;
    private long speed;

    public Player(String name, String address, String timeEnd) throws ParseException {
        this.name = name;
        this.address = address;
        this.id = solveId();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.timeEnd = sdf.format(sdf.parse(timeEnd));
        this.time = (double) (sdf.parse(this.timeEnd).getTime() - sdf.parse("06:00").getTime()) / (1000*60*60);
        this.speed = Math.round((float) 120 / this.time);
    }

    private String solveId() {
        String[] add = address.split("\\s+");
        String res="";
        String[] names = name.split("\\s+");
        for(String it : add){
            res+=it.toUpperCase().charAt(0);
        }
        for(String it : names) {
            res+=it.toUpperCase().charAt(0);
        }

        return res;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+address+" "+speed+" Km/h";
    }

    @Override
    public int compareTo(Player o) {
        return Double.compare(this.time, o.time);
    }
}
