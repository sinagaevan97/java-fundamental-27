package test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    // Unit Test menggunakan TestNG
    private Karyawan karyawan;
    private Divisi divisi;
    private Karyawan k1;
    private Karyawan k2;

    @BeforeMethod
    public void setup() {
        karyawan = new Karyawan();
        divisi = new Divisi("IT Division");

        k1 = new Karyawan();
        k1.setNama("Alice");
        k1.setJabatan("Manager");
        k1.setGajiPokok(15000000);

        k2 = new Karyawan();
        k2.setNama("Bob");
        k2.setJabatan("Staff");
        k2.setGajiPokok(8000000);
    }

    // Test Karyawan
    @Test
    public void testSetNama() {
        karyawan.setNama("John Doe");
        Assert.assertEquals(karyawan.getNama(), "John Doe");
    }

    @Test
    public void testSetJabatan() {
        karyawan.setJabatan("Manager");
        Assert.assertEquals(karyawan.getJabatan(), "Manager");
    }

    @Test
    public void testSetGajiPokok() {
        karyawan.setGajiPokok(10000000);
        Assert.assertEquals(karyawan.getGajiPokok(), 10000000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetNegativeGajiPokok() {
        karyawan.setGajiPokok(-1000000);
    }

    @Test
    public void testHitungGajiTotalManager() {
        karyawan.setJabatan("Manager");
        karyawan.setGajiPokok(10000000);
        double expected = 10000000 + 5000000;
        Assert.assertEquals(karyawan.hitungGajiTotal(), expected);
    }

    @Test
    public void testHitungGajiTotalStaff() {
        karyawan.setJabatan("Staff");
        karyawan.setGajiPokok(8000000);
        double expected = 8000000 + 2000000;
        Assert.assertEquals(karyawan.hitungGajiTotal(), expected);
    }

    @Test
    public void testHitungGajiTotalLainnya() {
        karyawan.setJabatan("Intern");
        karyawan.setGajiPokok(5000000);
        double expected = 5000000 + 0;
        Assert.assertEquals(karyawan.hitungGajiTotal(), expected);
    }

    @Test
    public void testUpdateGaji() {
        karyawan.setGajiPokok(10000000);
        karyawan.updateGaji(10);
        Assert.assertEquals(karyawan.getGajiPokok(), 11000000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateGajiNegativePersentase() {
        karyawan.setGajiPokok(10000000);
        karyawan.updateGaji(-5);
    }

    // Test Divisi
    @Test
    public void testGetNamaDivisi() {
        Assert.assertEquals(divisi.getNamaDivisi(), "IT Division");
    }

    @Test
    public void testSetNamaDivisi() {
        divisi.setNamaDivisi("HR Division");
        Assert.assertEquals(divisi.getNamaDivisi(), "HR Division");
    }

    @Test
    public void testTambahKaryawan() {
        divisi.tambahKaryawan(k1);
        Assert.assertEquals(divisi.getJumlahKaryawan(), 1);
        Assert.assertTrue(divisi.getDaftarKaryawan().contains(k1));
    }

    @Test
    public void testTambahKaryawanNull() {
        divisi.tambahKaryawan(null);
        Assert.assertEquals(divisi.getJumlahKaryawan(), 0);
    }

    @Test
    public void testGetJumlahKaryawan() {
        Assert.assertEquals(divisi.getJumlahKaryawan(), 0);
        divisi.tambahKaryawan(k1);
        Assert.assertEquals(divisi.getJumlahKaryawan(), 1);
        divisi.tambahKaryawan(k2);
        Assert.assertEquals(divisi.getJumlahKaryawan(), 2);
    }

    @Test
    public void testGetDaftarKaryawan() {
        divisi.tambahKaryawan(k1);
        divisi.tambahKaryawan(k2);
        Assert.assertEquals(divisi.getDaftarKaryawan().size(), 2);
        Assert.assertTrue(divisi.getDaftarKaryawan().contains(k1));
        Assert.assertTrue(divisi.getDaftarKaryawan().contains(k2));
    }

    // Main method untuk menjalankan test secara manual 
    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ujian2.class});
        testng.run();
    }
}
