import java.util.Scanner;

public class Bai2 {
    // Ham tinh va in mang tong
    public static void inMangTong(int[] a, int[] b) {
        int n;

        // Tim do dai cua mang dai hon
        if (a.length > b.length) {
            n = a.length;
        } else {
            n = b.length;
        }

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = 0;

            if (i < a.length) {
                c[i] = c[i] + a[i];
            }

            if (i < b.length) {
                c[i] = c[i] + b[i];
            }
        }

        System.out.print("Mang tong: ");

        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap mang A
        System.out.print("Nhap so phan tu mang A: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // Nhap mang B
        System.out.print("Nhap so phan tu mang B: ");
        int m = sc.nextInt();

        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Nhap b[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        // Goi ham
        inMangTong(a, b);

        sc.close();
    }
}