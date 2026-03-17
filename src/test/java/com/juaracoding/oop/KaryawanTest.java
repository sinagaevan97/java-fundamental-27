package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KaryawanTest {

    Karyawan karyawan;

    @BeforeClass
    public void setup() {
        karyawan = new Karyawan();
        System.out.println("Setup before running tests");
    }

    @Test(priority = 1)
    public void testSetNama() {
        karyawan.setNama("John Doe");
        Assert.assertEquals(karyawan.getNama(), "John Doe");
        System.out.println("Test setNama method passed");
    }

    @Test(priority = 2)
    public void testSetJabatan() {
        karyawan.setJabatan("Software Engineer");
        Assert.assertEquals(karyawan.getJabatan(), "Software Engineer");
        System.out.println("Test setJabatan method passed");
    }

    @Test(priority = 3)
    public void testSetSalary() {   
        karyawan.setSalary(5000);
        Assert.assertEquals(karyawan.getSalary(), 5000);
        System.out.println("Test setSalary method passed");
    }

    @Test(priority = 4, expectedExceptions = IllegalArgumentException.class)
    public void testSetNegativeSalary() {
        karyawan.setSalary(-1000);
        System.out.println("Test set negative salary passed");
    }

    @Test(priority = 5)
    public void testCalculateAnnualSalary() {
        karyawan.setSalary(5000);
        double annualSalary = karyawan.calculateAnnualSalary();
        Assert.assertEquals(annualSalary, 60000);
        System.out.println("Test calculateAnnualSalary method passed");
    }

    @Test(priority = 6)
    public void testCalculateTax() {
        karyawan.setSalary(5000);
        double tax = karyawan.calculateTax(); // 10% tax
        Assert.assertEquals(tax, 500);
        System.out.println("Test calculateTax method passed");
    }

}
