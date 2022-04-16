/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlbanhang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DaiLy {

    /**
     * @param args the command line arguments
     */
    private String maDaiLi;
    private String hoTen;
    private int soLuogHang;

    public DaiLy() {
    }

    public DaiLy(String maDaiLi, String hoTen, int soLuogHang) {
        this.maDaiLi = maDaiLi;
        this.hoTen = hoTen;
        this.soLuogHang = soLuogHang;
    }

    public String getMaDaiLi() {
        return maDaiLi;
    }

    public void setMaDaiLi(String maDaiLi) {
        this.maDaiLi = maDaiLi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoLuogHang() {
        return soLuogHang;
    }

    public void setSoLuogHang(int soLuogHang) {
        this.soLuogHang = soLuogHang;
    }

    @Override
    public String toString() {
        return "DaiLy{" + "maDaiLi=" + maDaiLi + ", hoTen=" + hoTen + ", soLuogHang=" + soLuogHang + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã:");
        maDaiLi = sc.nextLine();
        System.out.print("Nhập tên:");
        hoTen = sc.nextLine();
        System.out.print("Nhập số lượng:");
        soLuogHang = Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.printf("%s - %s - %d\n",maDaiLi,hoTen,soLuogHang);
    }

    public String getXepLoai(int soLuongHang){
        if (soLuongHang < 500) {
            return "yếu";
        }if (soLuongHang < 700) {
            return "Trung Bình";
        }else{
            return "Tốt";
        }
    }
}
