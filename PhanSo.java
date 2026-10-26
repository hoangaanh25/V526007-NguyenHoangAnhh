/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

/**
 *
 * @author HoangAnh
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "PhanSo{" + "tu=" + tu + ", mau=" + mau + '}';
    }
    // Cong 2 phan so
    public PhanSo cong(PhanSo p) {
        int t = tu * p.mau + p.tu * mau;
        int m = mau * p.mau;

        return new PhanSo(t, m);
    }

    // Tru 2 phan so
    public PhanSo tru(PhanSo p) {
        int t = tu * p.mau - p.tu * mau;
        int m = mau * p.mau;

        return new PhanSo(t, m);
    }

    // Nhan 2 phan so
    public PhanSo nhan(PhanSo p) {
        int t = tu * p.tu;
        int m = mau * p.mau;

        return new PhanSo(t, m);
    }

    // Chia 2 phan so
    public PhanSo chia(PhanSo p) {
        int t = tu * p.mau;
        int m = mau * p.tu;

        return new PhanSo(t, m);
    }

    // So sanh 2 phan so
    public int soSanh(PhanSo p) {
        double a = (double) tu / mau;
        double b = (double) p.tu / p.mau;

        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    // Tim UCLN
    public int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    // Rut gon phan so
    public void rutGon() {
        int ucln = UCLN(tu, mau);

        tu = tu / ucln;
        mau = mau / ucln;
    }
}
