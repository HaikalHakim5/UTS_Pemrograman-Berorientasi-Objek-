package uts_majanement_rental_mobil;

public class Penyewaan {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int durasi;
    private int total;

    public Penyewaan(String idP, String namaP, String telpP, Kendaraan kendaraan, int durasi) {
        this.pelanggan = new Pelanggan(idP, namaP, telpP); // composition
        this.kendaraan = kendaraan;
        this.durasi = durasi;
        hitungTotal();
        kendaraan.setTersedia(false);
    }

    public void hitungTotal() {
        total = kendaraan.getHargaSewa() * durasi;
    }

    public void tampilDetail() {
        System.out.println("--- DATA PENYEWAAN ---");
        pelanggan.tampilPelanggan();
        kendaraan.tampilInfo();
        System.out.println("Durasi sewa: " + durasi + " hari");
        System.out.println("Total: " + total);
    }
}
