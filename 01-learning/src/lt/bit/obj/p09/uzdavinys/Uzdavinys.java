package lt.bit.obj.p09.uzdavinys;

/*
 Sukurti interface color ir klases implementuojancias interface DONE
 Sugalvoti klase, kuri implementuoja IContainer interface,
  i kurios objekta galima prideti kiek norim objektu su Color interface
 */

public class Uzdavinys {
    public static void main(String[] args) {
        int color = 100;
        IContainer container = new Container();
        container.add( new A(color++) );
        container.add( new A(color++) );
        container.add( new B(color++) );
        container.add( new A(color++) );

        for (int i = 0; i < container.size(); i++) {
            Color c = container.get(i);
            System.out.println(c.getColor());
        }
    }
}

