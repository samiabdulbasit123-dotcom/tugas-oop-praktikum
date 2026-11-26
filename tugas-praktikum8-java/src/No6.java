class Civitas {
    String nama;
    String status;

    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status + " Fakultas Teknik");
        System.out.println("------------------------------------");
    }
}

// Subclass 1
class Dosen extends Civitas {
    public Dosen(String nama) {
        super(nama, "Dosen");
    }
}

// Subclass 2
class Mahasiswa extends Civitas {
    public Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

// Subclass 3
class Staff extends Civitas {
    public Staff(String nama) {
        super(nama, "Staff");
    }
}

public class No6 {
    public static void main(String[] args) {
        Dosen dsn = new Dosen("Dr. Budi Santoso, M.T.");
        Mahasiswa mhs = new Mahasiswa("Muhamad Samy Abdul Basit");
        Staff stf = new Staff("Siti Aminah, S.Kom.");

        System.out.println("=== DATA CIVITAS AKADEMIKA FT ===\n");
        dsn.tampilkanInfo();
        mhs.tampilkanInfo();
        stf.tampilkanInfo();
    }
}