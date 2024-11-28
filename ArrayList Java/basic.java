//Import goi Arrays
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class basic {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return n>1;
    }
    public static void main(String[] args) {
        //Khai bao ArrayList
        ArrayList<Integer> a=new ArrayList<>();
        // Thêm phần tử vào ArrayList
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(2);
        a.add(17);
        System.out.println(a.size());//Xem size cua a
        //Insert phan tu vao ArratList
        a.add(0,1000);//Chen phan tu vao index 0
        System.out.println(a);

        //Access an Item
        System.out.println(a.get(2));
        //Change an Item
        a.set(2, 2000);//Thay doi tai index 2 thanh gia tri 2000
        System.out.println(a);

        //Remove an Item
        a.remove(0); // Xoa phan tu tai index 0
        System.out.println(a);

        //Loop in ArrayList
        for(int i=0;i<a.size();i++){
            if(!isPrime(a.get(i))){
                System.out.print(a.get(i)+" ");
            }
        }
        System.out.println("");
        //Sort in ArrayList
        Collections.sort(a);
        for(Integer x : a){
            System.out.print(x+" ");
        }
        System.out.println("");
        //Sort theo giam dan
        Collections.sort(a,Collections.reverseOrder());
        for(Integer x : a){
            System.out.print(x+" ");
        }
    }   
}
