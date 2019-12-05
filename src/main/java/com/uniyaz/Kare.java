package com.uniyaz;

public class Kare extends Sekil {

    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public int alanHesapla(){
        return kenar*kenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

}