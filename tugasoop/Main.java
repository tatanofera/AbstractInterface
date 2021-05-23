package com.tugasoop;

public class Main {
    private static Object ketiga;

    public static void main(String[] args) {
        AlatMusik pertama = new Gitar("Gitar");
        pertama.CaraBermain();
        pertama.SetelNada();

        AlatMusik kedua = new Suling("Suling");
        kedua.CaraBermain();
        kedua.SetelNada();

        AlatMusik ketiga = new Drum("Drum");
        ketiga.CaraBermain();
        ketiga.SetelNada();
    }
}
