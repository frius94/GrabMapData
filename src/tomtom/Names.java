package tomtom;

public class Names {
    private String nameLocale;
    private String name;

    public Names(String nameLocale, String name) {
        this.nameLocale = nameLocale;
        this.name = name;
    }

    public String getNameLocale() {
        return nameLocale;
    }

    public void setNameLocale(String nameLocale) {
        this.nameLocale = nameLocale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
