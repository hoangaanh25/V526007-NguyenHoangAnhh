/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnb4;

/**
 *
 * @author HoangAnh
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Nhap danh sach nhan vien
        System.out.print("Nhap so nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0) {
            System.out.println("So nhan vien phai lon hon 0");
            return;
        }

        Nhanvien[] ds = new Nhanvien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap nhan vien thu " + (i + 1));

            ds[i] = new Nhanvien();
            ds[i].nhap(sc);
        }

        // 2. Xuat danh sach nhan vien
        System.out.println("\n=== DANH SACH NHAN VIEN ===");

        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println("----------------");
        }

        // 3. Tim nhan vien co SNCT nhieu nhat
        int max = ds[0].getSnct();

        for (int i = 1; i < n; i++) {
            if (ds[i].getSnct() > max) {
                max = ds[i].getSnct();
            }
        }

        System.out.println("\n=== NHAN VIEN CONG TAC LAU NHAT ===");

        for (int i = 0; i < n; i++) {
            if (ds[i].getSnct() == max) {
                ds[i].xuat();
                System.out.println("----------------");
            }
        }

        // 4. Sap xep luong giam dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (ds[i].tinhLuong() < ds[j].tinhLuong()) {

                    Nhanvien temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

        // 5. In danh sach sau khi sap xep
        System.out.println("\n=== DANH SACH LUONG GIAM DAN ===");

        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println("----------------");
        }

        sc.close();
    }
}
