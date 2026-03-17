package test;

import java.util.ArrayList;
import java.util.List;

public class Divisi {
    private String namaDivisi;
    private final List<Karyawan> daftarKaryawan;

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
