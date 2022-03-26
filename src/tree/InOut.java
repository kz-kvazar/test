package tree;

import java.util.Scanner;

public class InOut {

    private final Scanner sc;
    private double lenghtsTree;

    public InOut() {
        sc = new Scanner(System.in);
    }

    public String getNameTree() {

        System.out.println("Введите название дерева: ");
        return sc.nextLine();
    }

    public double getLenghts() {
        System.out.println("Введите высоту дерева: ");

        String leDu = sc.nextLine().replaceAll(",", ".");
        leDu = leDu.replaceAll("[^0-9.]", "");
        if (!leDu.isEmpty()){
            lenghtsTree = Double.parseDouble(leDu);
        }
        if (lenghtsTree > 1.5){
            return lenghtsTree;
        } else {
            return 1.5;
        }
    }
}
