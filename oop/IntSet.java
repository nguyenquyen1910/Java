import java.util.Scanner;
import java.util.TreeSet;
public class IntSet {
    //Luu y bien static co the dung chung cho moi doi tuong
    //Con bien instance vatiable chi dung cho 1 doi tuong cu the
    private TreeSet<Integer> se;
    public IntSet(int a[]){
        se=new TreeSet<>();
        for(int i=0;i<a.length;i++) se.add(a[i]);
    }
    public IntSet(TreeSet<Integer> se){
        this.se=se;
    }
    public IntSet intersection(IntSet ano){
        TreeSet<Integer> tmp=new TreeSet<>();
        for(int x : this.se){
            if(ano.se.contains(x)) tmp.add(x);
        }
        return new IntSet(tmp);
    }
    public IntSet union(IntSet ano){
        for(int x : ano.se){
            this.se.add(x);
        }
        return this;
    }
    public String toString() {
        String res="";
        for(int x : this.se){
            res+=x+" ";
        }
        return res;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),a[]=new int[n],b[]=new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        IntSet s1=new IntSet(a);
        IntSet s2=new IntSet(b);
        IntSet s3=s1.intersection(s2);
        IntSet s4=s1.union(s3);
        System.out.println(s3);
        System.out.println(s4);
    }
}
