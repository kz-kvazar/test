package Theatr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 String na;
 int ag;

        Scanner sc = new Scanner(System.in);
        Human[] human = new Human[3];

       for(int i = 0; human.length > i; i++){
            System.out.println("Имя" );
            na = sc.nextLine();
           System.out.println("Возраст");
           ag = Integer.parseInt(sc.nextLine().replaceAll("[^0-9.]", ""));
            human[i] = new Human(na,ag);
            }
       for (int i = 0; human.length >i; i++){
           human[i] = Academy.study(human[i]);
       }

       Concert.Present(human);
       Concert.Show(human);

    }
}
