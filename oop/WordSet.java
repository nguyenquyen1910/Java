import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> se;
    public WordSet(String s){
        this.se=new TreeSet<>();
        String[] res=s.split("\\s++");
        for(String x : res){
            this.se.add(x);
        }
    }
    public WordSet union(WordSet ano){
        WordSet res=new WordSet(" ");
        for(String x : ano.se){
            if(this.se.contains(x)){
                res.se.add(x);
            }
        }
        return res;
    }
    public WordSet intersection(WordSet ano){
        WordSet res=new WordSet(" ");
        for(String x : ano.se) res.se.add(x);
        for(String x : this.se) res.se.add(x);
        return res;
    }
    public String toString() {
        String res="";
        for(String x : this.se){
            res+=x+" ";
        }
        return res;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1=new WordSet(sc.nextLine());
        WordSet s2=new WordSet(sc.nextLine());
        WordSet s3=s1.union(s2);
        System.out.println(s3);
        WordSet s4=s1.intersection(s2);
        System.out.println(s4);
    }
}
