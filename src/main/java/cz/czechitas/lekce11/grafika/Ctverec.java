package cz.czechitas.lekce11.grafika;

import java.io.PrintStream;

public class Ctverec extends Tvar {
    private final int delkaStrany;

    public Ctverec(int delkaStrany) {
        this.delkaStrany = delkaStrany;
    }

    public Ctverec() {
        this(6);
    }


    @Override
    public void nakresli(PrintStream out) {
        nakresliHorizontalniCaru(out);
        for (int i = 0; i < delkaStrany - 2; i++) {
            nakresliVertikalniCary(out);
        }
        nakresliHorizontalniCaru(out);
    }

    private void nakresliHorizontalniCaru(PrintStream out) {
        out.println("******");
    }

    private void nakresliVertikalniCary(PrintStream out) {
        out.print('*');
        for (int i = 0; i < delkaStrany - 2; i++) {
            out.print(' ');
        }
        out.print('*');
        out.println();
    }
}
