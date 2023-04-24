package cz.czechitas.lekce11.grafika;

import java.io.PrintStream;

public abstract class Tvar {
    public void nakresli() {
        nakresli(System.out);
    }

    public abstract void nakresli(PrintStream out);
}
