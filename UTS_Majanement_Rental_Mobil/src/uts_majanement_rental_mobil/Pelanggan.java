package uts_majanement_rental_mobil;

// Class Pelanggan (dipakai dalam Penyewaan)
public class Pelanggan {
    private String id;
    private String nama;
    private String noTelp;

    // Constructor berparameter
    public Pelanggan(String id, String nama, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    // Menampilkan info pelanggan
    public void tampilPelanggan() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Telp: " + noTelp);
    }
}
