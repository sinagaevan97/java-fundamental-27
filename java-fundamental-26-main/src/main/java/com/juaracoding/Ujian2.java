package com.juaracoding;

import java.util.ArrayList;
import java.util.List;

public class Ujian2 {

    // Kelas Karyawan
    static class Karyawan {
        private String nama;
        private String jabatan;
        private double gajiPokok;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJabatan() {
            return jabatan;
        }

        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }

        public double getGajiPokok() {
            return gajiPokok;
        }

        public void setGajiPokok(double gajiPokok) {
            if (gajiPokok < 0) {
                throw new IllegalArgumentException("Gaji pokok tidak boleh negatif");
            }
            this.gajiPokok = gajiPokok;
        }

        public double hitungGajiTotal() {
            double tunjangan = 0;
            if ("Manager".equalsIgnoreCase(jabatan)) {
                tunjangan = 5000000;
            } else if ("Staff".equalsIgnoreCase(jabatan)) {
                tunjangan = 2000000;
            }
            return gajiPokok + tunjangan;
        }

        public void updateGaji(double persentase) {
            if (persentase < 0) {
                throw new IllegalArgumentException("Persentase tidak boleh negatif");
            }
            gajiPokok += gajiPokok * (persentase / 100);
        }
    }

    // Kelas Divisi
    static class Divisi {
        private String namaDivisi;
        private List<Karyawan> daftarKaryawan;

        public Divisi(String namaDivisi) {
            this.namaDivisi = namaDivisi;
            this.daftarKaryawan = new ArrayList<>();
        }

        public String getNamaDivisi() {
            return namaDivisi;
        }

        public void setNamaDivisi(String namaDivisi) {
            this.namaDivisi = namaDivisi;
        }

        public void tambahKaryawan(Karyawan karyawan) {
            if (karyawan != null) {
                daftarKaryawan.add(karyawan);
            }
        }

        public int getJumlahKaryawan() {
            return daftarKaryawan.size();
        }

        public List<Karyawan> getDaftarKaryawan() {
            return daftarKaryawan;
        }
    }

    // Unit Test menggunakan TestNG (simulasi, karena TestNG perlu di test/)
    // Untuk demo, kita buat method test di sini, tapi sebenarnya harus di test class
    public static void main(String[] args) {
        // Test Karyawan
        System.out.println("=== Test Karyawan ===");

        Karyawan karyawan = new Karyawan();
        karyawan.setNama("John Doe");
        assert karyawan.getNama().equals("John Doe") : "Test setNama failed";

        karyawan.setJabatan("Manager");
        assert karyawan.getJabatan().equals("Manager") : "Test setJabatan failed";

        karyawan.setGajiPokok(10000000);
        assert karyawan.getGajiPokok() == 10000000 : "Test setGajiPokok failed";

        // Test hitungGajiTotal Manager
        double totalManager = karyawan.hitungGajiTotal();
        assert totalManager == 15000000 : "Test hitungGajiTotal Manager failed: " + totalManager;

        // Test updateGaji
        karyawan.updateGaji(10);
        assert karyawan.getGajiPokok() == 11000000 : "Test updateGaji failed";

        // Test Staff
        karyawan.setJabatan("Staff");
        karyawan.setGajiPokok(8000000);
        double totalStaff = karyawan.hitungGajiTotal();
        assert totalStaff == 10000000 : "Test hitungGajiTotal Staff failed";

        // Test lainnya
        karyawan.setJabatan("Intern");
        karyawan.setGajiPokok(5000000);
        double totalIntern = karyawan.hitungGajiTotal();
        assert totalIntern == 5000000 : "Test hitungGajiTotal Intern failed";

        // Test exception
        try {
            karyawan.setGajiPokok(-1000000);
            assert false : "Should throw exception for negative gaji";
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            karyawan.updateGaji(-5);
            assert false : "Should throw exception for negative persentase";
        } catch (IllegalArgumentException e) {
            // Expected
        }

        System.out.println("All Karyawan tests passed!");

        // Test Divisi
        System.out.println("=== Test Divisi ===");

        Divisi divisi = new Divisi("IT Division");
        assert divisi.getNamaDivisi().equals("IT Division") : "Test getNamaDivisi failed";

        divisi.setNamaDivisi("HR Division");
        assert divisi.getNamaDivisi().equals("HR Division") : "Test setNamaDivisi failed";

        Karyawan k1 = new Karyawan();
        k1.setNama("Alice");
        k1.setJabatan("Manager");
        k1.setGajiPokok(15000000);

        Karyawan k2 = new Karyawan();
        k2.setNama("Bob");
        k2.setJabatan("Staff");
        k2.setGajiPokok(8000000);

        divisi.tambahKaryawan(k1);
        assert divisi.getJumlahKaryawan() == 1 : "Test tambahKaryawan failed";

        divisi.tambahKaryawan(k2);
        assert divisi.getJumlahKaryawan() == 2 : "Test tambahKaryawan second failed";

        assert divisi.getDaftarKaryawan().contains(k1) : "Test getDaftarKaryawan failed";
        assert divisi.getDaftarKaryawan().contains(k2) : "Test getDaftarKaryawan failed";

        // Test tambah null
        divisi.tambahKaryawan(null);
        assert divisi.getJumlahKaryawan() == 2 : "Test tambahKaryawan null failed";

        System.out.println("All Divisi tests passed!");
        System.out.println("All unit tests completed successfully!");
    }
}
