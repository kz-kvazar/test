package Plants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Plants[] plants = new Plants[50];
        String in;


        for (int i = 0; plants.length > i; i++) {
            System.out.println("1. Посадить дерево");
            System.out.println("2. Посадить траву");

            if (plants[0] != null) {
                System.out.println("3. Полить зелень");
            }

            System.out.println("0.Выход");
            in = sc.nextLine();
            in = in.replaceAll("[^0-9]", "");

            if (Integer.parseInt(in) == 1) {
                System.out.println("Вы посадили дерево");
                plants[i] = new Tree();
                plants[i].plants(0.5);
            } else if (Integer.parseInt(in) == 2) {
                System.out.println("Вы посадили траву");
                plants[i] = new Grass();
                plants[i].plants(0.1);
            } else if (Integer.parseInt(in) == 3){
                for (int e = 0; plants.length-1 > e; e++){
                    if (plants[e] != null){
                        plants[e].plants(0.1);
                    }
                }
            } else if (Integer.parseInt(in) == 0){
                break;
            }
        }
    }
}

