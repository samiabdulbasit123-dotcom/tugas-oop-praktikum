public class No10 {
    public static void main(String[] args) {
        
        Object[] data = {19, 0.2, 'C', "Java", true};

        System.out.println("Menampilkan data campuran:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + " = " + data[i] + " (Tipe: " + data[i].getClass().getSimpleName() + ")");
        }
    }
}