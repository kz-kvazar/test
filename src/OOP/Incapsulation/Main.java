package OOP.Incapsulation;

import OOP.Incapsulation.Coord;

public class Main {
    public static void main(String[] args) {
        Coord oldCoord = new Coord(30, 30);
Coord newCore = new Coord();
        //// ....
        Coord coord = new Coord(oldCoord);
        System.out.println(coord.getX());
        coord.setX(10);
        System.out.println(coord.getX());
    }

}
