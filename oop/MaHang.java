import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaHang {
    private String maMatHang;
    private int soLuongNhap;

    public MaHang(String maMatHang, int soLuongNhap) {
        this.maMatHang = maMatHang;
        this.soLuongNhap = soLuongNhap;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public int getSoLuongXuat() {
        if (this.maMatHang.charAt(0) == 'A') return (int) (this.soLuongNhap * 0.6);
        else return (int) (this.soLuongNhap * 0.7);
    }

    public int getDonGia() {
        if (this.maMatHang.charAt(this.maMatHang.length() - 1) == 'Y') return 110000;
        else return 135000;
    }

    public int getTien() {
        return this.getSoLuongXuat() * this.getDonGia();
    }

    public int getThue() {
        char first = this.maMatHang.charAt(0);
        char last = this.maMatHang.charAt(this.maMatHang.length() - 1);
        if (first == 'A') {
            if (last == 'Y') return (int) (getTien() * 0.08);
            else return (int) (getTien() * 0.11);
        } else {
            if (last == 'Y') return (int) (getTien() * 0.17);
            else return (int) (getTien() * 0.22);
        }
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.soLuongNhap + " " + this.getSoLuongXuat() + " " + this.getDonGia() + " " + this.getTien() + " " + this.getThue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MaHang[] a = new MaHang[n];
        for (int i = 0; i < n; i++) {
            String maMatHang = sc.nextLine();
            int soLuongNhap = Integer.parseInt(sc.nextLine());
            a[i] = new MaHang(maMatHa ng, soLuongNhap);
        }
        Arrays.sort(a, new Comparator<MaHang>() {
            @Override
            public int compare(MaHang o1, MaHang o2) {
                return o2.getThue() - o1.getThue();
            }
        });
        char c = sc.nextLine().charAt(0);
        for (MaHang i : a) {
            if (c == i.getMaMatHang().charAt(0)) {
                System.out.println(i.toString());
            }
        }
    }
}
