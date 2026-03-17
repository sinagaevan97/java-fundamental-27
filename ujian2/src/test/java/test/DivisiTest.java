package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivisiTest {

    private Divisi divisi;
    private Karyawan k1;
    private Karyawan k2;

    @BeforeMethod
    public void init() {
        divisi = new Divisi("IT Division");

        k1 = new Karyawan("Alice", "Manager", 15000000);
        k2 = new Karyawan("Bob", "Staff", 8000000);
    }

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
    public void testJumlahKaryawan() {
        Assert.assertEquals(divisi.getJumlahKaryawan(), 0);
        divisi.tambahKaryawan(k1);
        divisi.tambahKaryawan(k2);
        Assert.assertEquals(divisi.getJumlahKaryawan(), 2);
    }
}
