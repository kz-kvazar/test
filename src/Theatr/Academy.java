package Theatr;

import java.util.Scanner;

public interface Academy {

     static Artyst study(Human human) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Псевдоним будущего актера: ");
        return new Artyst(human.getName(), human.getAge(), sc.nextLine());
    }
}
