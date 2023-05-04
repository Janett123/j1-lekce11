package cz.czechitas.lekce11.pocasi;

public class InternetovyTeplomer implements ZjisteniTeploty {


    private final String url;

    public InternetovyTeplomer(String url) {
        this.url = url;
    }


    @Override
    public int zjistitTeplotu() {
        return 10;
    }

    @Override
    public int zjistitTeplotuVeFa() {
        return 94;
    }

    public String getUrl() {
        return url;
    }
}
