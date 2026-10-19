import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap ca dong
        System.out.println("Nhap cac so nguyen cach nhau bang dau cach:");
        String chuoi = sc.nextLine();

        // Dung Scanner de doc tung so trong chuoi
        Scanner docChuoi = new Scanner(chuoi);

        // Dem so phan tu
        int n = 0;

        while (docChuoi.hasNextInt()) {
            docChuoi.nextInt();
            n = n + 1;
        }

        docChuoi.close();

        // Tao mang va doc lai chuoi de luu cac so
        int[] a = new int[n];
        docChuoi = new Scanner(chuoi);

        int tong = 0;

        for (int i = 0; i < n; i++) {
            a[i] = docChuoi.nextInt();
            tong = tong + a[i];
        }

        System.out.println("So phan tu: " + n);
        System.out.println("Tong: " + tong);

        docChuoi.close();
        sc.close();
    }
}
