package J05071_tinhcuocdienthoaicodinh;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Province> provinces = new ArrayList<>();
        for(int i=0;i<n;i++){
            provinces.add(new Province(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Call> calls = new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] tmp=sc.nextLine().trim().split("\\s+");
            calls.add(new Call(tmp[0], tmp[1], tmp[2]));
        }
        for(Call call : calls){
            for(Province province : provinces){
                if(call.getPhoneNumber().startsWith("0")){
                    if(call.getPhoneNumber().substring(1,3).equals(province.getProId())){
                        call.setProvince(province);
                    }
                }
                else{
                    call.setProvince(new Province("00", "Noi mang", 800));
                }
            }
        }
        Collections.sort(calls);
        calls.forEach(System.out::println);
    }
}
