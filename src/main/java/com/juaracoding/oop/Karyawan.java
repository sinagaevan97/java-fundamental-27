package com.juaracoding.oop;

public class Karyawan {

    // attr
    private String nama;
    private String jabatan;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Salary: " + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public double calculateTax() {
        return salary * 0.1; // 10% tax
    }
}
