/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author HoangAnh
 */
public class MainBai2 {
    public static void main(String[] args) {

        // Tao tap hop cac phan so
        PhanSo[] ds = {
            new PhanSo(1, 2),
            new PhanSo(3, 4),
            new PhanSo(5, 2),
            new PhanSo(6, 3),
            new PhanSo(7, 5)
        };

        // In danh sach phan so
        System.out.println("Danh sach phan so:");

        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }

        // Tim phan so lon nhat
        PhanSo max = ds[0];

        for (int i = 1; i < ds.length; i++) {
            if (ds[i].soSanh(max) > 0) {
                max = ds[i];
            }
        }

        System.out.println("Phan so lon nhat: " + max);

        // Tinh tong cac phan so
        PhanSo tong = new PhanSo(0, 1);

        for (int i = 0; i < ds.length; i++) {
            tong = tong.cong(ds[i]);
        }

        tong.rutGon();

        System.out.println("Tong cac phan so: " + tong);

        // Xac dinh cac phan so khong phai so nguyen
        System.out.println("Cac phan so khong phai so nguyen:");

        for (int i = 0; i < ds.length; i++) {
            if (ds[i].getTu() % ds[i].getMau() != 0) {
                System.out.println(ds[i]);
            }
        }
    }
}
