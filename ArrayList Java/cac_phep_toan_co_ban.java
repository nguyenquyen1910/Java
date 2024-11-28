import java.util.Scanner;
/*Dòng đầu tiên ghi số lớn nhất trong mảng kèm theo vị trí của nó (bắt đầu từ 0), nếu có nhiều số cùng có giá trị 
lớn nhất thì lấy vị trí xuất hiện đầu tiên. Dòng thứ 2 ghi số nhỏ nhất trong mảng kèm theo vị trí của nó (bắt đầu từ 0)
,nếu có nhiều số cùng có giá trị nhỏ nhất thì lấy vị trí xuất hiện cuối cùng. Dòng thứ 3 ghi ra số lượng số nguyên tố 
xuất hiện trong dãy. Dòng thứ 4 ghi ra tích lớn nhất của 2 số trong mảng (2 số khi nhân với nhau tạo ra tích lớn nhất) 
Dòng thứ 5 in ra YES nếu mảng đối xứng, ngược lại in ra NO. Dòng thứ 6 tính tích các số trong mảng, kết quả lấy dư với 
(10^9+7)*/
public class cac_phep_toan_co_ban {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return n>1;
    }
    public static boolean isSymmetry(int a[],int n){
        int l=0,r=n-1;
        while(l<=r){
            if(a[l]!=a[r])
                return false;
            ++l;--r;
        }
        return true;
    }
    public static long[] F=new long[100];
    public static void init(){
        F[1]=F[2]=1;
        for(int i=3;i<=92;i++){
            F[i]=F[i-1]+F[i-2];
        }
    } 
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max_val=(int)-1e9,min_val=(int)1e9,pos1=0,pos2=0;
        int max_val2=(int)-1e9,min_val2=(int)1e9;
        int cnt=0,res=1;
        for(int i=0;i<n;i++){
            if(a[i]>max_val){
                max_val=a[i];
                pos1=i;
            }
            else if(a[i]>max_val2 && a[i]<=max_val){
                max_val2=a[i];
            }
            if(a[i]<=min_val){
                min_val=a[i];
                pos2=i;
            }
            else if(a[i]<min_val2 && a[i]>=min_val){
                min_val2=a[i];
            }
            if(isPrime(a[i])) cnt++;
            res*=a[i];
            res%=1000000007;
        }
        System.out.println(max_val + " " + pos1);
        System.out.println(min_val + " " + pos2);
        System.out.println(cnt);
        System.out.println(Math.max(1L*max_val*max_val2, 1L*min_val*min_val2));
        if(isSymmetry(a, n)){
            System.out.println("YES");
        }
        else System.out.println("NO");
        System.out.println(res);
    }
}
