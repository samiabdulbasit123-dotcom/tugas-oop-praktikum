import java.util.Scanner;

public class NamaHari {
    int kodeHari;

    public NamaHari(int kodeHari) {
        this.kodeHari = kodeHari;
    }

    public void tampilkanHari() {
        System.out.println("==================================================");
        System.out.println("SOAL 2: Menentukan Nama Hari");
        System.out.println("==================================================");
        switch (kodeHari) {
            case 1:
                System.out.println("Kode 1 = Senin");
                break;
            case 2:
                System.out.println("Kode 2 = Selasa");
                break;
            case 3:
                System.out.println("Kode 3 = Rabu");
                break;
            case 4:
                System.out.println("Kode 4 = Kamis");
                break;
            case 5:
                System.out.println("Kode 5 = Jumat");
                break;
            case 6:
                System.out.println("Kode 6 = Sabtu");
                break;
            case 7:
                System.out.println("Kode 7 = Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Masukkan angka 1 sampai 7.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1 - 7): ");
        int input = scanner.nextInt();

        NamaHari nh = new NamaHari(input);
        nh.tampilkanHari();
        scanner.close();
    }
}