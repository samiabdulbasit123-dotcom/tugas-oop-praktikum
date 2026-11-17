public class No2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota"; 
                System.out.println("Nilai indeks ke-" + i + " setelah diubah: " + mobil[i]);
            }
        }
    }
}