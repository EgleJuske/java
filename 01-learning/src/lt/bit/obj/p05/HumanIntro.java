package lt.bit.obj.p05;

import java.time.LocalDate;

public class HumanIntro {
    public static void main(String[] args) {

        Human[] humans = {null, null, null};

        Human h1 = new Human();
        h1.id = 1;
        h1.firstName = "Jonas";
        h1.lastName = "Jonaitis";
        h1.birthday = LocalDate.of(2000, 1, 31);
        humans[0] = h1;

        Human h2 = new Human();
        h2.id = 2;
        h2.firstName = "Antanas";
        h2.lastName = "Antanaitis";
        h2.birthday = LocalDate.of(1999, 5, 15);
        humans[1] = h2;

        for (Human h : humans) {
            if (h != null) {
                System.out.println(h.firstName + " " + h.lastName);
            } else {
                System.out.println("Neturime info apie zmogu");
            }
        }
    }
}

class Human {
    int id;
    String firstName;
    String lastName;
    LocalDate birthday;
}
