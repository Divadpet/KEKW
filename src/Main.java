import models.Kalkulacka;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int c1 = 10;
        int c2 = 20;

        int soucet = c1 + c2;

        System.out.println(soucet);

        Kalkulacka calc = new Kalkulacka();
        int soucet2 = calc.Soucet(18, 91);
        soucet2 += 10;
        System.out.println("Poslední součet= " + calc.getPosledniSoucet());
        calc.setPosledniSoucet(50);
        System.out.println("Poslední součet= " + calc.getPosledniSoucet());

        int c10 = 10;
        int c11 = 10;
        if (c10 == c11) {
            System.out.println();
        }
        Kalkulacka calc2 = new Kalkulacka();
        Kalkulacka calc3 = new Kalkulacka();

        if (calc2 != calc3) {
            System.out.println("calc nejsou stejný");
        }

        Kalkulacka calc4 = calc3;
        if (calc3 == calc4) {
            System.out.println("YES");
        }


    }
}