import java.util.Scanner;

public class HitungLuasBangunDatar {
    int pilihan;

    public HitungLuasBangunDatar(int pilihan) {
        this.pilihan = pilihan;
    }

    public void prosesMenu(Scanner scanner) {
        System.out.println("==================================================");
        System.out.println("SOAL 7: Perhitungan Luas Bangun Datar");
        System.out.println("==================================================");

        switch (pilihan) {
            case 1:
                System.out.println("--- Luas Persegi ---");
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi = " + luasPersegi);
                break;

            case 2:
                System.out.println("--- Luas Segitiga ---");
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;

            case 3:
                System.out.println("--- Luas Lingkaran ---");
                System.out.print("Masukkan jari-jari (r): ");
                double r = scanner.nextDouble();
                double luasLingkaran = Math.PI * r * r;
                System.out.println("Luas Lingkaran = " + luasLingkaran);
                break;

            case 4:
                System.out.println("--- Luas Trapesium ---");
                System.out.print("Masukkan sisi atas (a): ");
                double a = scanner.nextDouble();
                System.out.print("Masukkan sisi bawah (b): ");
                double b = scanner.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double t = scanner.nextDouble();
                double luasTrapesium = 0.5 * (a + b) * t;
                System.out.println("Luas Trapesium = " + luasTrapesium);
                break;

            case 5:
                System.out.println("--- Luas Layang-layang ---");
                System.out.print("Masukkan diagonal 1 (d1): ");
                double d1 = scanner.nextDouble();
                System.out.print("Masukkan diagonal 2 (d2): ");
                double d2 = scanner.nextDouble();
                double luasLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luasLayang);
                break;

            default:
                System.out.println("Pilihan menu tidak valid!");
        }
        System.out.println("==================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Menu Bangun Datar:");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Masukkan pilihan Anda (1-5): ");
        int pil = scanner.nextInt();

        HitungLuasBangunDatar h = new HitungLuasBangunDatar(pil);
        h.prosesMenu(scanner);
        scanner.close();
    }
}