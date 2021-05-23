package com.tugasoop;

public class Drum extends AlatMusik {
    public Drum(String Nama) {
        super(Nama);
    }

    @Override
    public void CaraBermain() {
        System.out.println(super.getNama() + " dimainkan dengan cara dipukul");
    }

    @Override
    public void SetelNada() {
        System.out.println("Setel nada pada " + super.getNama());
    }
}
