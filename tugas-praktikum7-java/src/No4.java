import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai  : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            
            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

     
        System.out.println("\n\t\tDaftar Nilai Mahasiswa");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s %-20s %-10s %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5s %-20s %-10s %-15s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("--------------------------------------------------");
        
        input.close();
    }
}