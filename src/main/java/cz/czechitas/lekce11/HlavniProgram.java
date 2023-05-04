package cz.czechitas.lekce11;

import cz.czechitas.lekce11.grafika.Ctverec;
import cz.czechitas.lekce11.grafika.Trojuhelnik;
import cz.czechitas.lekce11.grafika.Tvar;
import cz.czechitas.lekce11.pocasi.Person;
import cz.czechitas.lekce11.pocasi.RocniObdobi;
import cz.czechitas.lekce11.pocasi.Teplomer;
import cz.czechitas.lekce11.pocasi.ZjisteniTeploty;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * Hlaví třída aplikace.
 */
public class HlavniProgram implements Runnable {
    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String[] args) {
        new HlavniProgram().run();

        Person person = new Person("Eva","Bílá", LocalDate.of(1988, Month.APRIL, 24));
        System.out.printf("%s %s (%s)", person.jmeno(), person.prijmeni(),person.datumNarozeni());

        LocalDate datum = LocalDate.now();
        LocalDate predDvacetiDny = datum.minusDays(20L);

    }


    //RocniObdobi rocniObdobi = RocniObdobi.ZIMA;


    public void vypisTeplotu (ZjisteniTeploty zjisteniTeploty) {
        System.out.printf("Zjištěná teplota je: %d st.C", zjisteniTeploty.zjistitTeplotu()).println();
    }
    /**
     * Hlavní metoda obsahující výkonný kód.
     */
    @Override
    public void run() {
        nakresliTvar(new Ctverec());
        nakresliTvar(new Trojuhelnik());
    }

    private void nakresliTvar(Tvar tvar) {
        tvar.nakresli();
    }

}
