package OOP.PnC;

public class Main {

    public static void main(String[] args) {

        Boil[] cooker = new Boil[3];

        cooker[0] = new Baker();
        cooker[1] = new Welder();
        cooker[2] = new Baker();

        for (Boil elem: cooker) {
            if(elem instanceof Cooker) {
                System.out.println("It is cooker");
            }

            if(elem instanceof Bake) {
                System.out.println("I can bake too");
            } else {
                elem.boil();
            }

            System.out.println();
        }

        //  TODO read
        // foreach
        // abstract class
        // git
        // github - site
    }
}
