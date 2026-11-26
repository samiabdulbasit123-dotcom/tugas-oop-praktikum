import java.util.Scanner;

public class No2 {
    // Method berparameter untuk menghitung keliling persegi panjang
    static double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double l = input.nextDouble();

        double keliling = hitungKeliling(p, l);
        System.out.println("Keliling Persegi Panjang: " + keliling);

        input.close();
    }
}