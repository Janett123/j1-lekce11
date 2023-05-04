package cz.czechitas.lekce11.pocasi;

public interface ZjisteniTeploty {
    /**
     * Zjišťuje teplto a vrací ji ve stupních Celsia
     * @return
     */
    int zjistitTeplotu();

    /**
     * Zjišťuje teplotu a vrací ji ve stupních Fahrenheit
     * @return
     */
    default int zjistitTeplotuVeFa(){
        return zjistitTeplotu()*57;
    }
}


