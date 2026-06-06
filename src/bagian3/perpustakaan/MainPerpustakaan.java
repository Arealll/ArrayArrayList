package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(
                new Buku("Laskar Pelangi",
                        "Andrea Hirata",
                        2005));

        perpus.tambahBuku(
                new Buku("Bumi Manusia",
                        "Pramoedya",
                        1980));

        perpus.tambahBuku(
                new Buku("Sang Pemimpi",
                        "Andrea Hirata",
                        2006));

        perpus.tampilkanKoleksi();

        System.out.println();

        // Meminjam buku
        perpus.pinjamBuku("Bumi Manusia");

        // Mengembalikan buku (SOAL NO 1)
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        // Cari berdasarkan penulis (SOAL NO 3)
        perpus.cariPenulis("Andrea Hirata");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println("Buku tersedia: "
                + perpus.jumlahTersedia());
    }
}