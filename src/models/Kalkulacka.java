package models;

import java.time.LocalDateTime;

public class Kalkulacka {
    private int posledniSoucet;

    public LocalDateTime getCasZmeny() {
        return casZmeny;
    }

    private LocalDateTime casZmeny;

    public int getPosledniSoucet() {
        return posledniSoucet;
    }

    public void setPosledniSoucet(int c) {
        posledniSoucet = c;
    }

    public int Soucet(int c1, int c2) {
        int soucet = c1 + c2;
        System.out.println("Součet " + c1 + " a " + c2 + " je " + soucet);
        posledniSoucet = soucet;
        return soucet;
    }
}
