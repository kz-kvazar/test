package qwerty;

import java.util.Scanner;
public class Calc {
    static int menu(){
        System.out.println("1. Преобразование с двоичной системы в десятеричную");
        System.out.println("2. Преобразование с десятеричной системы в двоичную");
        System.out.println("0. Выход");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if (choose != 0 ){
            OnOrTwo(choose);
        }
        return choose;
    }
    static void OnOrTwo(int choose){
        if (choose == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите двоичное число");
            String two = sc.nextLine();
            Calculation(two, null);
        } else if (choose == 2){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите десятичное число");
            String ten = sc.nextLine();
            int tens = Integer.parseInt(ten);
            Calculation(null, tens);
        }
}
    static void Calculation (String two, Integer ten){
        if (two != null){
            int e = 0;
            double dub = 0;
            for (int i = two.length(); i > 0; i--){
                dub = dub + Math.pow(2, e) * (two.charAt(i - 1) - 48);
                e++;
            }
            System.out.println(dub);
        } else {
            StringBuilder TenTo = new StringBuilder();
            int rest;
            while ( 0 != ten){
                    ten = ten / 2;
                    rest = ten%2;
                    TenTo.append(rest);
        }
            System.out.println(TenTo);
        }
    }

    public static void main(String[] args) {
        System.out.println("Добро пожалывать в калькулятор");
        int m;
        do {
            m = menu();
        } while (m != 0);
    }
}
