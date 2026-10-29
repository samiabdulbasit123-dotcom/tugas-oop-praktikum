import java.util.Scanner;

public class CekBilangan {
    int bilangan;

    public CekBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    public void tentukanGenapGanjil() {
        System.out.println("==================================================");
        System.out.println("SOAL 1: Cek Bilangan Genap / Ganjil");
        System.out.println("==================================================");
        if (bilangan % 2 == 0) {
            System.out.println("Angka " + bilangan + " adalah bilangan GENAP.");
        } else {
            System.out.println("Angka " + bilangan + " adalah bilangan GANJIL.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int input = scanner.nextInt();
        
        CekBilangan cb = new CekBilangan(input);
        cb.tentukanGenapGanjil();
        scanner.close();
    }
}