package J07073_dangkyhinhthucday;

public class MonHoc implements Comparable<MonHoc> {
    private String id;
    private String name;
    private int unit;
    private String method;
    private String methodPractice;

    public MonHoc(String id, String name, int unit, String method, String methodPractice) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.method = method;
        this.methodPractice = methodPractice;
    }

    public String getMethodPractice() {
        return methodPractice;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.id.compareTo(o.id);
    }



    @Override
    public String toString() {
        return id+" "+name+" "+unit+" "+method+" "+methodPractice;
    }
}
