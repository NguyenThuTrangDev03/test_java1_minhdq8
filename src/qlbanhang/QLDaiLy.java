/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlbanhang;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author ADMIN
 */
public class QLDaiLy {
    
    ArrayList<DaiLy> lst;
    String _n;
    Scanner _sc;
    DaiLy _dl;

    public QLDaiLy() {
        lst = new ArrayList<>();
        _sc = new Scanner(System.in);
    }
    
    public void nhapDS() {
        System.out.print("Nhập số lượng:");
        _n = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_n); i++) {
            _dl = new DaiLy();
            System.out.print("Nhấp mã:");
            _dl.setMaDaiLi(_sc.nextLine());
            System.out.print("Nhấp tên:");
            _dl.setHoTen(_sc.nextLine());
            System.out.print("Nhấp mã:");
            _dl.setSoLuogHang(Integer.parseInt(_sc.nextLine()));
            lst.add(_dl);
        }
    }
    
    public void xuatDS() {
        for (int i = 0; i < lst.size(); i++) {
            System.out.printf("%s - %s - %d - %s\n", _dl.getMaDaiLi(), _dl.getHoTen(), _dl.getSoLuogHang(), _dl.getXepLoai(i));
        }
    }

    public void timKiem(int min, int max) {
        System.out.print("Nhập khoảng bắt đầu:");
        min = Integer.parseInt(_sc.nextLine());
        System.out.print("Nhập khoảng kết thức:");
        max = Integer.parseInt(_sc.nextLine());
        for (DaiLy x : lst) {
            if (x.getSoLuogHang() > min && x.getSoLuogHang() < max) {
                x.xuat();
            }
        }
    }
}
