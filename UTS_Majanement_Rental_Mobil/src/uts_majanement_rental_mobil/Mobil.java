package uts_majanement_rental_mobil;

// Subclass dari Kendaraan (Inheritance)
public class Mobil extends Kendaraan {
    private int jumlahKursi;

    // Memanggil constructor superclass
    public Mobil(String kode, String nama, int hargaSewa, int jumlahKursi) {
        super(kode, nama, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    // Method khusus Mobil (Polymorphism opsional)
    public void jenisKendaraan() {
        System.out.println(getNama() + " adalah Mobil dengan " + jumlahKursi + " kursi.");
    }
}
