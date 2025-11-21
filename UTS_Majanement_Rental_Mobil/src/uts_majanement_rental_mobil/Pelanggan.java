package uts_majanement_rental_mobil;

public class Pelanggan {
    private String id;
    private String nama;
    private String noTelp;

    public Pelanggan(String id, String nama, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public void tampilPelanggan() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Telp: " + noTelp);
    }
}
