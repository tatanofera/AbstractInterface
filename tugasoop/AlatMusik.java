package com.tugasoop;

public abstract class AlatMusik implements Mainkan {
    protected String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public AlatMusik(String Nama) {
        nama = Nama;
    }

    @Override
    public void CaraBermain() {
        System.out.println("Belum diketahui");
    }

    @Override
    public void SetelNada() {
        System.out.println("Belum disetel");
    }
}
