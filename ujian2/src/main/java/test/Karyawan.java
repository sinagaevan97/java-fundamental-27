package test;

public class Karyawan {
    private String nama;
    private String jabatan;
    private double gajiPokok;

    public Karyawan() {
    }

    public Karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.setGajiPokok(gajiPokok);
    }

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
