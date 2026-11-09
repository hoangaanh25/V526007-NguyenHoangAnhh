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

public class Nhanvien extends Nguoi {

    private int snct;
    private double hsl;

    public Nhanvien() {
    }

    public Nhanvien(String hoTen, int tuoi,
                    int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    // Nhap thong tin nhan vien
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    // Tinh tien luong
    public double tinhLuong() {
        return 1500000 * hsl + 200000 * snct;
    }

    // Xuat thong tin nhan vien
    @Override
    public void xuat() {
        super.xuat();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.println("Tien luong: " + tinhLuong());
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "hoTen=" + hoTen
                + ", tuoi=" + tuoi
                + ", snct=" + snct
                + ", hsl=" + hsl
                + ", tienLuong=" + tinhLuong() + '}';
    }
}