package lt.bit.obj.p04;

public class Switch {

    public static void main(String[] args) {

        int x = (int) Math.round(Math.random() * 10);
        System.out.println(x);

        switch (x) {
            case 0:
                System.out.println("nulis");
                break;
            default:
                System.out.println("skaicius, kuris nera nulis, vienas arba du");
                break;
            case 1:
                System.out.println("vienas");
                break;
            case 2:
                System.out.println("du");
                break;
        }

    }
}
