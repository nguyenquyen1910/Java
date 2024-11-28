package J04018_sophuc;

public class SoPhuc {
    private int a,b;

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static SoPhuc sumNum(SoPhuc x,SoPhuc y) {
        return new SoPhuc(x.a+y.a,x.b+y.b);
    }
    public static SoPhuc mulNum(SoPhuc x,SoPhuc y) {
        return new SoPhuc(x.a*y.a-x.b*y.b,x.b*y.a+x.a*y.b);
    }

    @Override
    public String toString() {
        String res="";
        res+=a+" ";
        if(b>0){
            res+="+ "+b+"i";
        }
        else{
            res+="- "+(-b)+"i";
        }
        return res;
    }
}
