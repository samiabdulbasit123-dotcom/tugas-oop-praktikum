import java.util.Arrays;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }

       
        int max = arr[0];
        int min = arr[0];
        int idxMax = 0;
        int idxMin = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }

        System.out.println("\n--- Hasil 3c ---");
        System.out.println("Nilai terbesar : " + max + " (indeks ke-" + idxMax + ")");
        System.out.println("Nilai terkecil : " + min + " (indeks ke-" + idxMin + ")");

        // 3d. Jumlahkan semua data array dan cari rata-ratanya
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        double rataRata = (double) total / n;

        System.out.println("\n--- Hasil 3d ---");
        System.out.println("Total data     : " + total);
        System.out.println("Rata-rata      : " + rataRata);

        
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }

        
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }

        System.out.println("\n--- Hasil 3e & 3f ---");
        System.out.println("Jumlah elemen indeks ganjil (NPM genap) : " + jumlahIndeksGanjil);
        System.out.println("Jumlah elemen indeks genap  (NPM ganjil): " + jumlahIndeksGenap);

        
        int hasilDipilih = jumlahIndeksGanjil; 
        String status = (hasilDipilih % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("\n--- Hasil 3g ---");
        System.out.println("Hasil (" + hasilDipilih + ") bernilai: " + status);

       
        int[] arrUrut = arr.clone(); 
        Arrays.sort(arrUrut);

        System.out.println("\n--- Hasil 3h ---");
        System.out.println("Array sebelum diurutkan : " + Arrays.toString(arr));
        System.out.println("Array setelah diurutkan : " + Arrays.toString(arrUrut));

        input.close();
    }
}