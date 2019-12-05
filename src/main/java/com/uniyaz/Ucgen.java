package com.uniyaz;

public class Ucgen extends Sekil {
    private int taban, yukseklik;


    public Ucgen(int taban, int yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    @Override
    public int alanHesapla() {
        return (taban * yukseklik) / 2;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

}