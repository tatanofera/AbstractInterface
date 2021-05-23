package com.tugasoop;

public class Suling extends AlatMusik {
    public Suling(String Nama) {
        super(Nama);
    }

    @Override
    public void CaraBermain() {
        System.out.println(super.getNama() + " dimainkan dengan cara ditiup");
    }

    @Override
    public void SetelNada() {
        System.out.println("Setel nada pada " + super.getNama());
    }
}
