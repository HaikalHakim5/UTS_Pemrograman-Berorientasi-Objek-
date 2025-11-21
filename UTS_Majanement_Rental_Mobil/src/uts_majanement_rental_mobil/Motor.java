package uts_majanement_rental_mobil;

// Subclass Kendaraan
public class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String kode, String nama, int hargaSewa, String tipeMotor) {
        super(kode, nama, hargaSewa);  // Constructor parent
        this.tipeMotor = tipeMotor;
    }

    public void jenisKendaraan() {
        System.out.println(getNama() + " adalah Motor tipe: " + tipeMotor);
    }
}
