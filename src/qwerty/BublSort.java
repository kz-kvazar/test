package qwerty;

import java.util.Scanner;

public class BublSort {
    static String[] bubl_Sort(String input) {
        String [] arr = input.split(" ");
        for (int i = 0; arr.length > i; i++){
            for (int e = 0; arr.length > e + 1; e++){
                if (Integer.parseInt(arr[e]) > Integer.parseInt(arr[e + 1])){
                    //System.out.println(Integer.valueOf(arr[e]) + " i " + arr[e + 1] + " e");
                    int small = Integer.parseInt(arr[e]);
                    int biger = Integer.parseInt(arr[e + 1]);
                    arr [e] = String.valueOf(biger);
                    arr [e + 1] = String.valueOf(small);
                }
            }
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
        return arr;
    }
    static void find_In_Arr (String[] seq, int finde){
        int min = Integer.parseInt(seq[0]);
        int max = Integer.parseInt(seq[seq.length - 1]);
        for (int i = 0; i < 15; i++) {
            if (finde < ((max - min) / 2) + min) {
                max = (((max - min) / 2) + min);
                //System.out.println("find< " + max + " " + min);
            } else if (finde > ((max - min) / 2) + min){
                min = (((max - min) / 2) + min);
                //System.out.println("find> " + max + " " + min);
            } if (max - min < 2){
                max += 1;
                min -= 1;}
            if (finde == ((max - min)/2) + min) {
                for (int e = 0; e < seq.length; e++){
                    if (finde == Integer.parseInt(seq[e])){
                        System.out.println(" Искомое число " + (((max - min)/2) + min) + " найдено и оно есть в массиве!");
                        break;
                    } if (e == seq.length - 1){
                        System.out.println(" Искомое число " + (((max - min)/2) + min) + " найдено, но его нет в массиве!");
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность чисел ");
        String input = sc.nextLine();

        String [] seq = bubl_Sort(input);

        System.out.println();
        int max = Integer.parseInt(seq[seq.length - 1]);
        System.out.println("Введите число от 0" + " до " + max);
        int finde = sc.nextInt();

         find_In_Arr(seq,finde);
    }
}
