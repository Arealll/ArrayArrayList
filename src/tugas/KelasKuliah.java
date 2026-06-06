package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    // Menyimpan data mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Menghitung rata-rata nilai
    public double hitungRataRata() {

        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Menampilkan semua data mahasiswa
    public void tampilkanSemua() {

        System.out.println("===== DATA MAHASISWA =====");

        for (Mahasiswa mhs : daftarMahasiswa) {

            System.out.println("Nama  : " + mhs.getNama());
            System.out.println("NPM   : " + mhs.getNpm());
            System.out.println("Nilai : " + mhs.getNilai());
            System.out.println("Status: " +
                    (mhs.lulus() ? "Lulus" : "Tidak Lulus"));
            System.out.println("-------------------------");
        }
    }

    // Mengembalikan jumlah seluruh mahasiswa
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}