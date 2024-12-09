package xemphim;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        List<Type> types = new ArrayList<>();
        for(int i=0;i<n;i++){
            types.add(new Type(i, sc.nextLine()));
        }

        List<Film> films = new ArrayList<>();
        for(int i=0;i<m;i++){
            films.add(new Film(i, sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        for(Film film : films){
            for(Type type : types){
                if(film.getTypeId().equals(type.getTypeId())){
                    film.setType(type);
                    break;
                }
            }
        }

        Collections.sort(films);
        films.forEach(System.out::println);
    }
}
