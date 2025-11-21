package uts_majanement_rental_mobil;

import java.util.ArrayList;
import java.util.Scanner;

public class UTS_Majanement_Rental {
    static ArrayList<Kendaraan> dataKendaraan = new ArrayList<>();
    static ArrayList<Penyewaan> dataSewa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n===== MENU RENTAL =====");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Kendaraan");
            System.out.println("3. Cari Kendaraan");
            System.out.println("4. Ubah Harga Sewa");
            System.out.println("5. Tambah Penyewaan");
            System.out.println("6. Tampilkan Penyewaan");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1 -> tambahKendaraan(sc);
                case 2 -> tampilKendaraan();
                case 3 -> cariKendaraan(sc);
                case 4 -> ubahHarga(sc);
                case 5 -> tambahPenyewaan(sc);
                case 6 -> tampilSewa();
            }
        } while (pilih != 7);
    }

    static void tambahKendaraan(Scanner sc) {
        System.out.print("1) Mobil | 2) Motor : ");
        int jenis = sc.nextInt();

        System.out.print("Kode : ");
        String kode = sc.next();
        System.out.print("Nama : ");
        String nama = sc.next();
        System.out.print("Harga Sewa : ");
        int harga = sc.nextInt();

        if (jenis == 1) {
            System.out.print("Jumlah Kursi : ");
            int kursi = sc.nextInt();
            dataKendaraan.add(new Mobil(kode, nama, harga, kursi));
        } else {
            System.out.print("Tipe Motor : ");
            String tipe = sc.next();
            dataKendaraan.add(new Motor(kode, nama, harga, tipe));
        }

        System.out.println("Kendaraan berhasil ditambahkan!");
    }

    static void tampilKendaraan() {
        for (Kendaraan k : dataKendaraan) {
            k.tampilInfo();
            System.out.println("Status: " + k.cekStatus());
        }
    }

    static void cariKendaraan(Scanner sc) {
        System.out.print("Masukkan kode kendaraan: ");
        String kode = sc.next();

        for (Kendaraan k : dataKendaraan) {
            if (k.getKode().equals(kode)) {
                k.tampilInfo();
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    static void ubahHarga(Scanner sc) {
        System.out.print("Masukkan kode kendaraan: ");
        String kode = sc.next();

        for (Kendaraan k : dataKendaraan) {
            if (k.getKode().equals(kode)) {
                System.out.print("Harga baru: ");
                int harga = sc.nextInt();
                k.setHargaSewa(harga);
                System.out.println("Harga diupdate!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    static void tambahPenyewaan(Scanner sc) {
        System.out.print("Kode kendaraan: ");
        String kode = sc.next();

        Kendaraan dipilih = null;
        for (Kendaraan k : dataKendaraan) {
            if (k.getKode().equals(kode) && k.isTersedia()) {
                dipilih = k;
                break;
            }
        }

        if (dipilih == null) {
            System.out.println("Tidak tersedia!");
            return;
        }

        System.out.print("ID Pelanggan: ");
        String id = sc.next();
        System.out.print("Nama Pelanggan: ");
        String nama = sc.next();
        System.out.print("No Telp: ");
        String telp = sc.next();
        System.out.print("Durasi sewa: ");
        int durasi = sc.nextInt();

        Penyewaan sewa = new Penyewaan(id, nama, telp, dipilih, durasi);
        dataSewa.add(sewa);

        System.out.println("Penyewaan berhasil!");
    }

    static void tampilSewa() {
        for (Penyewaan ps : dataSewa) {
            ps.tampilDetail();
            System.out.println();
        }
    }
}
