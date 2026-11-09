/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author HoangAnh
 */
public class Diem2D {

    protected double x;
    protected double y;

    public Diem2D() {
    }

    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Tinh khoang cach giua 2 diem 2D
    public double khoangCach(Diem2D d) {
        return Math.sqrt(
                Math.pow(x - d.x, 2)
                + Math.pow(y - d.y, 2)
        );
    }

    // Xac dinh diem doi xung qua goc toa do
    public Diem2D doiXung() {
        return new Diem2D(-x, -y);
    }

    // Tinh tien diem
    public void tinhTien(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public String toString() {
        return "Diem2D{" + "x=" + x + ", y=" + y + '}';
    }
}
