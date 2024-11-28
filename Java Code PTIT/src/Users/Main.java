package Users;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<User> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new User(sc.nextLine()));
        }
        Map<String, Integer> map=new LinkedHashMap<>();
        int m=Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++){
            String x=sc.nextLine();
            int cnt=0;
            for(int j=0;j<a.size();j++){
                if(x.equals(a.get(j).getUserCheck())){
                    map.put(x,map.getOrDefault(x,0)+1);
                }
            }
        }
        for(User x : a){
            if(map.get(x.getUserCheck())==null){
                System.out.print(0+" ");
            }
            else{
                System.out.print(map.get(x.getUserCheck()) + " ");
            }
        }
    }
}
