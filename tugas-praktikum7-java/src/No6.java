import java.util.Scanner;
import java.util.InputMismatchException;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        
        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan yang ingin dirata-ratakan: ");
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("Jumlah bilangan harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("[Error] Masukan harus berupa angka (integer)! Silakan coba lagi.\n");
                input.next();
            }
        }

        int[] arr = new int[n];
        double total = 0;

        
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                arr[i] = input.nextInt();
                total += arr[i];
            } catch (InputMismatchException e) {
                System.out.println("[Error] Bukan angka! Masukkan ulang nilai untuk indeks ini.");
                input.next(); 
                i--; 
            }
        }

        double rataRata = total / n;
        System.out.println("\nTotal keseluruhan: " + total);
        System.out.println("Nilai rata-rata   : " + rataRata);

        input.close();
    }
}