package uts_majanement_rental_mobil;

public class Kendaraan {
    private String kode;
    private String nama;
    private int hargaSewa;
    private boolean tersedia = true;

    // Constructor berparameter
    public Kendaraan(String kode, String nama, int hargaSewa) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    // Getter & Setter (encapsulation)
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getHargaSewa() { return hargaSewa; }
    public boolean isTersedia() { return tersedia; }

    public void setHargaSewa(int harga) { this.hargaSewa = harga; }
    public void setTersedia(boolean status) { this.tersedia = status; }

    // Method tambahan
    public void tampilInfo() {
        System.out.println("Kode : " + kode + " | Nama : " + nama + " | Harga Sewa : " + hargaSewa);
    }

    public String cekStatus() {
        return tersedia ? "Tersedia" : "Disewa";
    }
}
