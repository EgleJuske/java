import java.lang.reflect.Array;

public class MokinysUzd {
    public static void main(String[] args) {

    Mokinys[] mokiniai = {null, null, null, null, null};
    Mokinys m1 = new Mokinys();
    m1.klase = 7;
    m1.vardas = "Toras";
    m1.pavarde = "Torincijus";
    mokiniai[0] = m1;

    Mokinys m2 = new Mokinys();
    m2.klase = 5;
    m2.vardas = "Hulkas";
    m2.pavarde = "Torincijus";
    mokiniai[1] = m2;

    Mokinys m3 = new Mokinys();
    m3.klase = 7;
    m3.vardas = "Spaideris";
    m3.pavarde = "Spaidermenas";
    mokiniai[2] = m3;

    Mokinys m4 = new Mokinys();
    m4.klase = 5;
    m4.vardas = "Batas";
    m4.pavarde = "Batmanas";
    mokiniai[3] = m4;

    Mokinys m5 = new Mokinys();
    m5.klase = 7;
    m5.vardas = "Batas";
    m5.pavarde = "Spaidermenas";
    mokiniai[4] = m5;

    for (Mokinys m : mokiniai) {
        System.out.println(m.klase + " " + m.vardas + " " + m.pavarde);
    }

    }
}