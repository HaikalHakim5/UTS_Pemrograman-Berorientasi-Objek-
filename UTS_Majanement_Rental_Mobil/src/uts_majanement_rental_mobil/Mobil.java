package uts_majanement_rental_mobil;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String kode, String nama, int hargaSewa, int jumlahKursi) {
        super(kode, nama, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    public void jenisKendaraan() {
        System.out.println(getNama() + " adalah Mobil dengan " + jumlahKursi + " kursi.");
    }
}
