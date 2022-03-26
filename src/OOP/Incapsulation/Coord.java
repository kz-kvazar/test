package OOP.Incapsulation;

public class Coord {

    private int x;
    private  int y;

    public Coord() {
        x = 20;
        y = 20;
    }

    public Coord(int x) {
        this.x = x;
    }

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coord(Coord coord) {
        this.x = coord.getX();
        this.y = coord.getY() * 2;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
