package lt.bit.obj.p05;

import lt.bit.obj.p05.intro.Mokinys;

public class MokinysUzd {
    public static void main(String[] args) {

        Mokinys[] mokiniai = readFromDB();

        System.out.println("-----Pradiniai duomenys-----");
        print(mokiniai);

        //surusiuoti pagal klase
        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if (mokiniai[i].getKlase() > mokiniai[j].getKlase()) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
                if (compare(mokiniai[i], mokiniai[j]) > 1) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }
        }

        System.out.println();
        System.out.println("-----Surusiuoti mokiniai pagal klase-----");
        print(mokiniai);
    }

    static void print(Mokinys[] mokiniai) {
        for (Mokinys m : mokiniai) {
            System.out.println(m.getKlase() + " " + m.getVardas() + " " + m.getPavarde());
        }
    }

    static int compare(Mokinys m1, Mokinys m2) {
        if (m1.getKlase() < m2.getKlase()) return -1;
        if (m1.getKlase() > m2.getKlase()) return 1;
        return m1.getVardas().compareTo(m2.getVardas());
    }

    static Mokinys[] readFromDB() {
        Mokinys[] mokiniai = new Mokinys[] {
                new Mokinys(),
                new Mokinys("Toris", "Toriukas"),
                new Mokinys(7, "Toras", "Torincijus"),
                new Mokinys(5, "Hulkas", "Hulkamanas"),
                new Mokinys(7, "Spaideris", "Spaidermenas"),
                new Mokinys(5, "Batas", "Batmanas"),
                new Mokinys(7, "Iron", "Spaidermenas"),
        };

        mokiniai[0].setKlase(3);
        mokiniai[0].setVardas("Antanas");
        mokiniai[0].setPavarde("Antanaitis");

        return mokiniai;
    }

}