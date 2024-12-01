package J05082_danhsachkhachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customer implements Comparable<Customer> {
    private String id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private Long date;

    public Customer(int i, String name, String gender, String dateOfBirth, String address) throws ParseException {
        this.id = "KH"+String.format("%03d", i+1);
        this.name = formatName(name);
        this.gender = gender;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = sdf.format(sdf.parse(dateOfBirth));
        this.date = sdf.parse(this.dateOfBirth).getTime();
        this.address = address;
    }

    private String formatName(String name) {
        String[] tmp = name.trim().split("\\s+");
        String res="";
        for(String it : tmp) {
            res+=it.substring(0,1).toUpperCase() + it.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+gender+" "+address+" "+dateOfBirth;
    }

    @Override
    public int compareTo(Customer o) {
        if(Long.compare(this.date,o.date)!=0){
            return Long.compare(this.date, o.date);
        }
        return this.id.compareTo(o.id);
    }
}
