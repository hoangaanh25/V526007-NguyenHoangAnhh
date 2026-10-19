import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so phan tu
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        // Tao mang gom n phan tu
        int[] a = new int[n];

        // Nhap cac phan tu cua mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // Tinh tong
        int tong = 0;

        for (int i = 0; i < n; i++) {
            tong = tong + a[i];
        }

        System.out.println("Tong cac phan tu: " + tong);

        sc.close();
    }
}