/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author HoangAnh
 */
public class MainPhanSo {
    public static void main(String[] args) {

        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);

        System.out.println("Phan so 1: " + p1);
        System.out.println("Phan so 2: " + p2);

        System.out.println("Tong: " + p1.cong(p2));
        System.out.println("Hieu: " + p1.tru(p2));
        System.out.println("Tich: " + p1.nhan(p2));
        System.out.println("Thuong: " + p1.chia(p2));

        if (p1.soSanh(p2) > 0) {
            System.out.println("p1 lon hon p2");
        } else if (p1.soSanh(p2) < 0) {
            System.out.println("p1 nho hon p2");
        } else {
            System.out.println("p1 bang p2");
        }

        PhanSo p3 = new PhanSo(6, 8);

        System.out.println("Truoc rut gon: " + p3);

        p3.rutGon();

        System.out.println("Sau rut gon: " + p3);
    }
}
