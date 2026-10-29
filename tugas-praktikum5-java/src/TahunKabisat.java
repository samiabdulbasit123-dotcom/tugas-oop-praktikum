import java.util.Scanner;

public class TahunKabisat {
    int tahun;

    public TahunKabisat(int tahun) {
        this.tahun = tahun;
    }

    public void cekKabisat() {
        System.out.println("==================================================");
        System.out.println("SOAL 4: Menentukan Tahun Kabisat");
        System.out.println("==================================================");
        
        boolean isKabisat = false;

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    isKabisat = true;
                }
            } else {
                isKabisat = true;
            }
        }

        if (isKabisat) {
            System.out.println("Tahun " + tahun + " adalah TAHUN KABISAT.");
        } else {
            System.out.println("Tahun " + tahun + " BUKAN tahun kabisat.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun yang ingin dicek: ");
        int inputTahun = scanner.nextInt();

        TahunKabisat tk = new TahunKabisat(inputTahun);
        tk.cekKabisat();
        scanner.close();
    }
}