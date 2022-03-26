package OOP.PnC;

public abstract class Cooker implements Boil {
    @Override
    public void boil() {
        System.out.println("I boil borsh");
    }

    abstract void bake();
}
