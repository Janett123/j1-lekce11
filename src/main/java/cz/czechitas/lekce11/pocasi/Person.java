package cz.czechitas.lekce11.pocasi;

import java.time.LocalDate;

public record Person(String jmeno, String prijmeni, LocalDate datumNarozeni) {

    public int vek(){
        return 18;
    }
}
