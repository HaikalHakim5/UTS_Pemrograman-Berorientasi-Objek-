package uts_majanement_rental_mobil;

public class Penyewaan {

    // Relasi Composition: Penyewaan MEMILIKI Pelanggan & Kendaraan
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;

    // Atribut untuk durasi dan total biaya
    private int durasi;
    private int total;

    // Constructor berparameter (syarat UTS)
    public Penyewaan(String idP, String namaP, String telpP, Kendaraan kendaraan, int durasi) {

        // Membuat objek pelanggan di dalam penyewaan → Composition
        this.pelanggan = new Pelanggan(idP, namaP, telpP);

        // Menampung objek kendaraan yang disewa
        this.kendaraan = kendaraan;

        this.durasi = durasi;

        // Hitung total biaya otomatis saat membuat objek penyewaan
        hitungTotal();

        // Ubah status kendaraan → sekarang "Disewa"
        kendaraan.setTersedia(false);
    }

    // Method tambahan: menghitung total biaya sewa
    public void hitungTotal() {
        total = kendaraan.getHargaSewa() * durasi;
    }

    // Method tambahan: menampilkan detail penyewaan
    public void tampilDetail() {
        System.out.println("--- DATA PENYEWAAN ---");
        pelanggan.tampilPelanggan();     // Menampilkan data pelanggan
        kendaraan.tampilInfo();          // Menampilkan data kendaraan
        System.out.println("Durasi sewa: " + durasi + " hari");
        System.out.println("Total: " + total);
    }
}
