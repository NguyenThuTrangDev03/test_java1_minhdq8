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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {            
            Scanner sc = new Scanner(System.in);
            System.out.println("\n+---------Menu-----------+");
            System.out.println("1.Đối tượng");
            System.out.println("2.ArrayList");
            System.out.println("3.Thoát");
            System.out.println("+------------------------------+");
            System.out.print("Chọn chức năng:");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("1.Dôi tượng");
                    DaiLy dl1 = new DaiLy("PH12", "trangnt", 10);
                    DaiLy dl2 = new DaiLy("PH01", "maidtt", 18);
                    dl1.xuat();
                    dl2.xuat();
                    break;
                case "2":
                    System.out.println("2.ArrayList");
                    QLDaiLy ql = new QLDaiLy();
                    System.out.println(">>Nhập đối tượng:");
                    ql.nhapDS();
                    System.out.println(">>Xuat:");
                    ql.xuatDS();
                    System.out.println(">>Tìm kiếm:");
                    ql.timKiem(0, 0);
                    break;
                case "3":
                    System.out.println("Kế thừa");
                    DaiLyCon c = new DaiLyCon(100, "PHC123", "hantt", 20);
                    c.xuat();
                    break;
                default:
                    System.out.println("Không có chức năng này, vui long chọn lại!!");
            }
        }
    }

}
