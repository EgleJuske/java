package lt.bit.obj.p05.intro;

public class Mokinys {
    private int klase;
    private String vardas;
    private String pavarde;

    public Mokinys() {}

    public Mokinys(String vardas, String pavarde) {
        if (vardas == null || vardas.length() <= 1) {
            throw new IllegalArgumentException("ERROR: neirasytas vardas, arba jis trumpesnis nei 2 raides");
        }
       this.klase = 1;
       this.vardas = vardas;
       this.pavarde = pavarde;
    }

    public Mokinys(int klase, String vardas, String pavarde) {
//        if (vardas == null || vardas.length() <= 1) {
//            throw new IllegalArgumentException("ERROR: neirasytas vardas, arba jis trumpesnis nei 2 raides");
//        }
        //kvieciame metoda is maziau parametru turicio konstruktoriaus
        //kvieciamas konstruktorius turi buti auksciau
        this(vardas, pavarde);
        this.klase = klase;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        if (vardas == null || vardas.length() <= 1) {
            throw new IllegalArgumentException("ERROR: neirasytas vardas, arba jis trumpesnis nei 2 raides");
        }
        this.vardas = vardas;
    }

    public String getPavarde() {
        if (pavarde == null || pavarde.length() <= 1) {
            throw new IllegalArgumentException("ERROR: neirasytas vardas, arba jis trumpesnis nei 2 raides");
        }
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
}
