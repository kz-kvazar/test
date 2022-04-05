package Test;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(7);
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(7));
        arr.remove(1);
        System.out.println(arr.contains(3));
        arr.add(2, 77);
        arr.trimToSize(); // оптимизация массива
        System.out.println(arr);
        System.out.println(arr.size());


    }
}
