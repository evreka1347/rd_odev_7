package org.example;

public class Main {
    public static void main(String[] args) {

     for (Planet planet : Planet.values()){
         System.out.println(planet.name() + " gezegenin bilgileri: ");
         System.out.println("sıralaması: " + planet.getSiralama());
         System.out.println("Güneş'e uzaklığı " + planet.getuzaklik() + " milyon km");
         System.out.println("Yarıçapı: " + planet.getyaricap() + " km");
         System.out.println("Dönme süresi: " + planet.getdonmeSuresi() + " gün");
         System.out.println();
     }
    }
}