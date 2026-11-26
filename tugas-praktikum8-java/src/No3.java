import java.util.Scanner;

public class No3 {
    // Method berparameter untuk menghitung trik bulan dan tanggal lahir
    static int tebakLahir(int bulan, int tanggal) {
        int langkah1 = bulan * 2;
        int langkah2 = langkah1 + 5;
        int langkah3 = langkah2 * 50;
        int langkah4 = langkah3 + tanggal;
        int hasilAkhir = langkah4 - 250;
        
        return hasilAkhir;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan lahir (1-12)   : ");
        int bulan = input.nextInt();
        System.out.print("Masukkan tanggal lahir (1-31) : ");
        int tanggal = input.nextInt();

        int hasil = tebakLahir(bulan, tanggal);
        System.out.println("Hasil akhir tebakan (Bulan & Tanggal) = " + hasil);

        input.close();
    }
}