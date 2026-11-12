public class SoalNomor5 {
    public static void main(String[] args) {
        int tinggi = 5;
        
        System.out.println("=== Half Triangle ===");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Full Triangle ===");
       
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < 3; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        
        for (int i = 2; i >= 1; i--) {
            for (int j = 3; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}