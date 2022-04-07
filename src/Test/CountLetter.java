package Test;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        System.out.println("Введите строку для подсчета разных символов: ");
        Scanner sc = new Scanner(System.in);
        char[] charact = sc.nextLine().toCharArray();
        int space = 0;
        int numb = 0;
        int leter = 0;

        for (char c : charact) {
            if (Character.isDigit(c)) {
                numb += 1;
            } else if (Character.isLetter(c)) {
                leter += 1;
            } else if (Character.isSpaceChar(c)) {
                space += 1;
            }
        }
        System.out.println("В сторке " + leter + " букв, " + numb + " цифр, " + space + " пробелов");
    }
}
