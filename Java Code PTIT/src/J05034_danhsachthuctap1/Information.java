package J05034_danhsachthuctap1;

public class Information implements Comparable<Information> {
    private int tmpId;
    private String id;
    private String name;
    private String className;
    private String mail;
    private String group;

    public Information(int i, String id, String name, String className, String mail, String group) {
        this.tmpId = i+1;
        this.id = id;
        this.name = name;
        this.className = className;
        this.mail = mail;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public int compareTo(Information o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return tmpId+" "+id+" "+name+" "+className+ " "+mail+" "+group;
    }
}
