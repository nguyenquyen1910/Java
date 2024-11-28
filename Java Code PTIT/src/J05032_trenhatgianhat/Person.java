package J05032_trenhatgianhat;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String birthday;
    private Integer year;
    private Integer month;
    private Integer day;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.year = Integer.parseInt(birthday.substring(6));
        this.month = Integer.parseInt(birthday.substring(3, 5));
        this.day = Integer.parseInt(birthday.substring(0, 2));
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if(!this.year.equals(o.year)){
            return this.year - o.year;
        }
        if(!this.month.equals(o.month)){
            return this.month - o.month;
        }
        return this.day - o.day;
    }
}
