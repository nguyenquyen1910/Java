package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> list = (ArrayList<SinhVien>) inp.readObject();
        for (SinhVien i : list) {
            System.out.println(i);
        }
    }
}
