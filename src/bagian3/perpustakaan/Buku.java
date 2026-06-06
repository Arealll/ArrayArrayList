package bagian3.perpustakaan;

public class Buku {

    private String judul;
    private String penulis;
    private int tahunTerbit; // SOAL NO 2
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() { // SOAL NO 2
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";

        return judul + " oleh " + penulis
                + " (" + tahunTerbit + ") "
                + "[" + status + "]";
    }
}