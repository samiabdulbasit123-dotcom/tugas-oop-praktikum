class Mobil {
    String merk;

    void nyalakanMesin() {
        System.out.println("Mesin mobil " + merk + " menyala!");
    }
}

public class No1 {
    public static void main(String[] args) {
        // Mekanisme instansiasi: Kelas 'Mobil' dicetak menjadi objek 'mobilSaya'
        Mobil mobilSaya = new Mobil(); 
        
        mobilSaya.merk = "Honda Civic";
        mobilSaya.nyalakanMesin();
    }
}