import java.util.Scanner;

public class GajiKaryawan {
    String nik, nama;
    int kodeGolongan, jumlahAnak;

    public GajiKaryawan(String nik, String nama, int kodeGolongan, int jumlahAnak) {
        this.nik = nik;
        this.nama = nama;
        this.kodeGolongan = kodeGolongan;
        this.jumlahAnak = jumlahAnak;
    }

    public void hitungDanTampilkanGaji() {
        double gajiPokok = 0;
        String keteranganGolongan = "";

        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                keteranganGolongan = "Menikah";
                break;
            case 2:
                gajiPokok = 1500000;
                keteranganGolongan = "Belum menikah";
                break;
            case 3:
                gajiPokok = 1750000;
                keteranganGolongan = "Cerai";
                break;
            case 4:
                gajiPokok = 2000000;
                keteranganGolongan = "Menikah dan punya anak";
                break;
            default:
                gajiPokok = 0;
                keteranganGolongan = "Tidak Valid";
        }

        double tunjanganPasangan = (kodeGolongan == 1 || kodeGolongan == 4) ? (0.10 * gajiPokok) : 0;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("==================================================");
        System.out.println("SOAL 3: Menghitung Gaji Bersih Karyawan");
        System.out.println("==================================================");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Keterangan Golongan : " + keteranganGolongan);
        System.out.println("Gaji Pokok          : Rp " + gajiPokok);
        System.out.println("Tunjangan Pasangan  : Rp " + tunjanganPasangan);
        System.out.println("Tunjangan Anak      : Rp " + tunjanganAnak);
        System.out.println("Total Tunjangan     : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih         : Rp " + gajiBersih);
        System.out.println("==================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIK          : ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan Nama         : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Masukkan Jumlah Anak  : ");
        int anak = scanner.nextInt();

        GajiKaryawan gk = new GajiKaryawan(nik, nama, gol, anak);
        gk.hitungDanTampilkanGaji();
        scanner.close();
    }
}