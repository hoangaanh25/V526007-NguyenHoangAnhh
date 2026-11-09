/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author HoangAnh
 */
public class Diem3D extends Diem2D {

    private double z;

    public Diem3D() {
    }

    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Tinh khoang cach giua 2 diem 3D
    public double khoangCach(Diem3D d) {
        return Math.sqrt(
                Math.pow(x - d.x, 2)
                + Math.pow(y - d.y, 2)
                + Math.pow(z - d.z, 2)
        );
    }

    // Dinh nghia lai ham doi xung
    @Override
    public Diem3D doiXung() {
        return new Diem3D(-x, -y, -z);
    }

    // Tinh tien diem 3D
    public void tinhTien(double dx, double dy, double dz) {
        x = x + dx;
        y = y + dy;
        z = z + dz;
    }

    @Override
    public String toString() {
        return "Diem3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
