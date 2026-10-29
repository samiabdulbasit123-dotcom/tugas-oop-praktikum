import java.util.Scanner;

public class KomisiSalesman {
    double pendapatanHariItu;

    public KomisiSalesman(double pendapatanHariItu) {
        this.pendapatanHariItu = pendapatanHariItu;
    }

    public void hitungKomisi() {
        double uangJasa = 0;
        double persentaseKomisi = 0;

        if (pendapatanHariItu <= 2000000) {
            uangJasa = 100000;
            persentaseKomisi = 0.10;
        } else if (pendapatanHariItu <= 5000000) {
            uangJasa = 200000;
            persentaseKomisi = 0.15;
        } else {
            uangJasa = 300000;
            persentaseKomisi = 0.20;
        }

        double uangKomisi = persentaseKomisi * pendapatanHariItu;
        double totalPendapatan = uangJasa + uangKomisi;

        System.out.println("==================================================");
        System.out.println("SOAL 5: Menghitung Pendapatan Salesman");
        System.out.println("==================================================");
        System.out.println("Total Penjualan      : Rp " + pendapatanHariItu);
        System.out.println("Uang Jasa            : Rp " + uangJasa);
        System.out.println("Uang Komisi          : Rp " + uangKomisi);
        System.out.println("Total Pendapatan     : Rp " + totalPendapatan);
        System.out.println("==================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari itu (Rp): ");
        double penjualan = scanner.nextDouble();

        KomisiSalesman ks = new KomisiSalesman(penjualan);
        ks.hitungKomisi();
        scanner.close();
    }
}