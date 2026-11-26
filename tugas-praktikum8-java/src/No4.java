class SumpahPemuda {
    String pembuka;

    // Konstruktor berisi kalimat pembuka
    public SumpahPemuda() {
        this.pembuka = "Kami putra dan putri Indonesia";
    }

    // Method untuk menampilkan lanjutan tiga sumpah
    void tampilkanSumpah() {
        System.out.println(pembuka + ", mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println(pembuka + ", mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println(pembuka + ", menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class No4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanSumpah();
    }
}