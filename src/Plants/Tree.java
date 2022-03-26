package Plants;

public class Tree implements Plants {
    double len;

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    @Override
    public void plants(double lenghts) {

        len +=lenghts;
        System.out.println("Высота дерева " + len + " метров");
    }
}
