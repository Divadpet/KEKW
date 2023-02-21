import models.Cislo;
import models.Kalkulacka;
import models.Zlomek;

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

        Cislo cislo1 = new Cislo(15);
        Cislo cislo2 = new Cislo(23.6f);

        double soucetCisel = cislo1.getCislo() + cislo2.getCislo();
        double soucetCisel2 = calc.Soucet(cislo1.getCislo(), cislo2.getCislo());
        double soucetCisel3 = calc.Soucet(cislo1, cislo2);

        Zlomek z1 = new Zlomek(5, 3);
        Zlomek z2 = new Zlomek(8, 5);

        System.out.println(z1);
        System.out.println(z1.toString());

        Zlomek z3 = new Zlomek(5, 3);
        if (z1 != z3) {
            System.out.println("Z1 != Z3");
        }

        if (z1.equals(z3))
            System.out.println("Z1 equals Z3");

        int modulo = 5 % 2;
        System.out.println("modulo:" + modulo);

        Cislo.vypisPocetHvezdicek(15);

        System.out.println("z1 společný dělitel:" + Zlomek.NejvetsiSpolecnyDelitel(5, 3));

        double soucet3 = calc.Soucet(z1, z2);
    }
}