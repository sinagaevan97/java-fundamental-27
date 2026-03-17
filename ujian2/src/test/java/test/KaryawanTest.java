package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KaryawanTest {

    private Karyawan karyawan;

    @BeforeMethod
    public void init() {
        karyawan = new Karyawan();
    }

    @Test
    public void testSetGetNama() {
        karyawan.setNama("John Doe");
        Assert.assertEquals(karyawan.getNama(), "John Doe");
    }

    @Test
    public void testSetGetJabatan() {
        karyawan.setJabatan("Manager");
        Assert.assertEquals(karyawan.getJabatan(), "Manager");
    }

    @Test
    public void testSetGajiPokok() {
        karyawan.setGajiPokok(10000000);
        Assert.assertEquals(karyawan.getGajiPokok(), 10000000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetGajiPokokNegatif() {
        karyawan.setGajiPokok(-1);
    }

    @Test
    public void testHitungGajiTotalManager() {
        karyawan.setJabatan("Manager");
        karyawan.setGajiPokok(10000000);
        Assert.assertEquals(karyawan.hitungGajiTotal(), 15000000.0);
    }

    @Test
    public void testHitungGajiTotalStaff() {
        karyawan.setJabatan("Staff");
        karyawan.setGajiPokok(8000000);
        Assert.assertEquals(karyawan.hitungGajiTotal(), 10000000.0);
    }

    @Test
    public void testHitungGajiTotalLain() {
        karyawan.setJabatan("Intern");
        karyawan.setGajiPokok(5000000);
        Assert.assertEquals(karyawan.hitungGajiTotal(), 5000000.0);
    }

    @Test
    public void testUpdateGaji() {
        karyawan.setGajiPokok(10000000);
        karyawan.updateGaji(10);
        Assert.assertEquals(karyawan.getGajiPokok(), 11000000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUpdateGajiNegatif() {
        karyawan.setGajiPokok(10000000);
        karyawan.updateGaji(-5);
    }
}
