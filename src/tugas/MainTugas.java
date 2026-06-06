package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "231001", 85));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "231002", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Citra", "231003", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Dina", "231004", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eko", "231005", 45));

        // Menampilkan daftar mata kuliah (array String)
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("===== DAFTAR MATA KULIAH =====");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Menampilkan seluruh mahasiswa
        kelas.tampilkanSemua();

        // Menampilkan rata-rata nilai
        System.out.printf("Rata-rata Nilai : %.2f\n",
                kelas.hitungRataRata());

        // Menampilkan jumlah lulus
        System.out.println("Jumlah Mahasiswa Lulus : "
                + kelas.jumlahLulus());

        // Menampilkan jumlah data awal
        System.out.println("Jumlah Data Awal : "
                + kelas.jumlahMahasiswa());

        // Menambahkan satu mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "231006", 80));

        // Menampilkan jumlah data terbaru
        System.out.println("\nSetelah Menambah Mahasiswa Baru");

        System.out.println("Jumlah Data Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}