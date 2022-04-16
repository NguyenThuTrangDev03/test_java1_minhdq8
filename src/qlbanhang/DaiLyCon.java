/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlbanhang;

/**
 *
 * @author ADMIN
 */
public class DaiLyCon extends DaiLy{
    int hoaHong;

    public DaiLyCon() {
    }

    public DaiLyCon(int hoaHong, String maDaiLi, String hoTen, int soLuogHang) {
        super(maDaiLi, hoTen, soLuogHang);
        this.hoaHong = hoaHong;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Hoa hong: %d",hoaHong);
    }
    
}
