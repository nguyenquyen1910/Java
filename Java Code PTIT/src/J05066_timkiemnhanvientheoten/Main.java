/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timkiemnhanvientheoten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        
        int cntGD=0, cntTP=0, cntPP=0;
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().trim().split("\\s+", 2);
            NhanVien nhanVien = new NhanVien(tmp[0], tmp[1]);
            if(nhanVien.getChucVu().toUpperCase().equals("GD") && cntGD>=1){
                nhanVien.setChucVu("NV");
            }
            if(nhanVien.getChucVu().toUpperCase().equals("TP") && cntTP>=3){
                nhanVien.setChucVu("NV");
            }
            if(nhanVien.getChucVu().toUpperCase().equals("PP") && cntPP>=3){
                nhanVien.setChucVu("NV");
            }
            
            if(nhanVien.getChucVu().toUpperCase().equals("GD")){
                cntGD++;
            }
            if(nhanVien.getChucVu().toUpperCase().equals("TP")){
                cntTP++;
            }
            if(nhanVien.getChucVu().toUpperCase().equals("GD")){
                cntPP++;
            }
            list.add(nhanVien);
        }
        
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            String query = sc.nextLine().trim().toLowerCase();
            list.forEach(e -> {
                if(e.getTen().toLowerCase().contains(query)){
                    System.out.println(e);
                }
            });
            System.out.println("");
        }
    }
}
