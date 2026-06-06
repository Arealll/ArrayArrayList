package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {

    public static void main(String[] args) {

        // ==============================
        // SOAL 1
        // ==============================
        System.out.println("=== SOAL 1 ===");

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");

        // Hapus item ke-2
        daftarBelanja.remove(1);

        System.out.println("Isi daftar belanja:");

        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }

        System.out.println("Jumlah item akhir: "
                + daftarBelanja.size());



        // ==============================
        // SOAL 2
        // ==============================
        System.out.println("\n=== SOAL 2 ===");

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(15);
        angka.add(42);
        angka.add(8);
        angka.add(67);
        angka.add(30);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("Isi angka: " + angka);
        System.out.println("Nilai terbesar: " + terbesar);



        // ==============================
        // SOAL 3
        // ==============================
        System.out.println("\n=== SOAL 3 ===");

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ani");
        nama.add("Citra");
        nama.add("Aisyah");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {

            if (n.startsWith("A")) {
                System.out.println(n);
            }

        }
    }
}