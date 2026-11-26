public class No5 {
    // Method rekursif untuk menghitung faktorial
    static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case (kondisi berhenti)
        } else {
            return n * faktorial(n - 1); // Memanggil dirinya sendiri
        }
    }

    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial(angka));
    }
}