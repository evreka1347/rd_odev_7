package org.example;

public enum Planet {
    MERKUR(1, 57000000, 4884, 0.2),
    VENUS(2, 110000000, 12346, 0.6),
    DUNYA(3, 148000000, 12709, 1),
    MARS(4, 148384000, 6767, 1.8),
    JUPITER(5, 780000000, 142647, 11.6),
    SATURN(6, 1438000000, 124309, 29.5),
    URANUS(7, 297000000, 51767, 84.1),
    NEPTUN(8, 456800000, 49138, 164.8);

    private final int siralama;
    private final int uzaklik;
    private final int yaricap;
    private final double donmeSuresi;

    Planet(int siralama, int uzaklik, int yaricap, double donmeSuresi){

        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiralama(){
        return siralama;
    }
    public int getuzaklik(){
        return uzaklik;
    }
    public int getyaricap(){
        return yaricap;
    }
    public double getdonmeSuresi(){
        return donmeSuresi;
    }

}
