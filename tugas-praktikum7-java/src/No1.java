public class No1 {
    public static void main(String[] args) {
        // Variasi 1: Deklarasi ukuran array terlebih dahulu, lalu isi per indeks
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // Variasi 2: Langsung inisialisasi nilai saat deklarasi (array literal)
        int[] arr2 = {10, 20, 30};

        // Variasi 3: Menggunakan keyword new dan langsung mengisi nilai
        int[] arr3 = new int[]{10, 20, 30};

        System.out.println("Variasi 1 indeks 0: " + arr1[0]);
        System.out.println("Variasi 2 indeks 1: " + arr2[1]);
        System.out.println("Variasi 3 indeks 2: " + arr3[2]);
    }
}