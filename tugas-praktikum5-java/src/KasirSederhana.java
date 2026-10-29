import java.util.Scanner;

public class KasirSederhana {
    String punyaMember;
    double totalBelanja;
    double uangBayar;

    public KasirSederhana(String punyaMember, double totalBelanja, double uangBayar) {
        this.punyaMember = punyaMember;
        this.totalBelanja = totalBelanja;
        this.uangBayar = uangBayar;
    }

    public void hitungTransaksi() {
        double diskon = 0;

        // Logika if-else bersarang sesuai ketentuan soal
        if (punyaMember.equalsIgnoreCase("y") || punyaMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = totalBelanja - diskon;
        double kembalian = uangBayar - totalBayar;

        System.out.println("==================================================");
        System.out.println("SOAL 6: Program Kasir Sederhana");
        System.out.println("==================================================");
        System.out.println("Punya Kartu Member : " + punyaMember);
        System.out.println("Total Belanja      : Rp " + totalBelanja);
        System.out.println("Diskon             : Rp " + diskon);
        System.out.println("Total yang Harus Dibayar: Rp " + totalBayar);
        System.out.println("Uang yang Diberikan: Rp " + uangBayar);
        
        if (uangBayar >= totalBayar) {
            System.out.println("Uang Kembalian     : Rp " + kembalian);
        } else {
            System.out.println("Uang Anda kurang sebesar: Rp " + (totalBayar - uangBayar));
        }
        System.out.println("==================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/t): ");
        String member = scanner.nextLine();
        System.out.print("Masukkan total belanja (Rp)        : ");
        double belanja = scanner.nextDouble();
        System.out.print("Masukkan uang yang diberikan (Rp)  : ");
        double bayar = scanner.nextDouble();

        KasirSederhana kasir = new KasirSederhana(member, belanja, bayar);
        kasir.hitungTransaksi();
        scanner.close();
    }
}