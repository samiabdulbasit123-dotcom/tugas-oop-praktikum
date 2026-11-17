public class No9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        
        System.out.println("--- Menggunakan For Loop Biasa ---");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + age[i]);
        }

        
        System.out.println("\n--- Menggunakan For-Each Loop ---");
        for (int nilai : age) {
            System.out.println("Nilai: " + nilai);
        }
    }
}