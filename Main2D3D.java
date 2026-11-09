/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author HoangAnh
 */
public class Main2D3D {
    public static void main(String[] args) {

        Diem2D d1 = new Diem2D(1, 2);
        Diem2D d2 = new Diem2D(3, 4);

        Diem3D d3 = new Diem3D(1, 2, 3);
        Diem3D d4 = new Diem3D(4, 5, 6);

        System.out.println("=== CAC DIEM BAN DAU ===");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);

        System.out.println("\n=== KHOANG CACH ===");

        System.out.println("Khoang cach d1 - d2: "
                + d1.khoangCach(d2));

        System.out.println("Khoang cach d3 - d4: "
                + d3.khoangCach(d4));

        System.out.println("\n=== DIEM DOI XUNG ===");

        System.out.println("Doi xung d1: "
                + d1.doiXung());

        System.out.println("Doi xung d3: "
                + d3.doiXung());

        d1.tinhTien(2, 3);

        d3.tinhTien(2, 3, 4);

        System.out.println("\n=== SAU KHI TINH TIEN ===");

        System.out.println("d1: " + d1);
        System.out.println("d3: " + d3);

        Diem2D[] ds = {
            new Diem2D(1, 2),
            new Diem2D(3, 4),
            new Diem3D(1, 2, 3),
            new Diem3D(4, 5, 6)
        };

        System.out.println("\n=== DANH SACH DIEM ===");

        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }

        double tong2D = 0;
        double tong3D = 0;

        for (int i = 0; i < ds.length - 1; i++) {

            if (ds[i] instanceof Diem3D
                    && ds[i + 1] instanceof Diem3D) {

                Diem3D a = (Diem3D) ds[i];
                Diem3D b = (Diem3D) ds[i + 1];

                tong3D = tong3D + a.khoangCach(b);

            }

            else if (!(ds[i] instanceof Diem3D)
                    && !(ds[i + 1] instanceof Diem3D)) {

                tong2D = tong2D
                        + ds[i].khoangCach(ds[i + 1]);
            }
        }

        System.out.println("\n=== TONG KHOANG CACH ===");

        System.out.println("Tong khoang cach cac diem 2D: "
                + tong2D);

        System.out.println("Tong khoang cach cac diem 3D: "
                + tong3D);


        Diem2D[] dsDoiXung = new Diem2D[ds.length];

        for (int i = 0; i < ds.length; i++) {
            dsDoiXung[i] = ds[i].doiXung();
        }


        System.out.println("\n=== DANH SACH DIEM DOI XUNG ===");

        for (int i = 0; i < dsDoiXung.length; i++) {
            System.out.println(dsDoiXung[i]);
        }
    }
}

