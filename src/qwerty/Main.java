package qwerty;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
//        System.out.println("Введите число бутылок с водой:");
//
//        double number = sc.nextInt()*0.25;
//
//        System.out.println("У вас " + number + " литров воды");
//
//        System.out.println("Высота ёлочки:");
//        int numb = sc.nextInt();
//
//         for (int i = 1; numb > i - 1; i++) {
//             for (int e = 0; numb > e - 1; e++){
//                 if ((numb - i) <= e){
//                     System.out.print("#");}
//                  else{
//                 System.out.print(" ");}
//             }
//             System.out.println();}

//        System.out.println("Сколько у вас денег?:");
//        Double sumT = scS.nextDouble();
//        double sumD = Double.parseDouble(sumT) * 100;
//        int sumI = (int) sumD;
//        int whole = 0;
//        if (sumI >= 50) {
//            whole += Math.floorDiv(sumI, 50);
//            sumI = sumI % 50;
//        } if (sumI >= 25) {
//            whole += Math.floorDiv(sumI,  25);
//            sumI = sumI % 25;
//        } if (sumI >= 10) {
//            whole += Math.floorDiv(sumI, 10);
//            sumI = sumI % 10;
//        } if (sumI >= 5) {
//            whole += Math.floorDiv(sumI, 5);
//            sumI = sumI % 5;
//        } if (sumI >= 2) {
//            whole += Math.floorDiv(sumI, 2);
//            sumI = sumI % 2;
//        } if (sumI >= 1) {
//            whole += 1;
//        }
//        System.out.println(whole);
//        System.out.println("Введите слова анограммы");
        String in = scS.nextLine();
        String[] anogram = in.split(" ");
        //char [] sort = anogram[].toCharArray();
        for (int i = 0; anogram.length > i; i++){
            char [] word1 = anogram[i].toCharArray();
            //System.out.println(anogram[i] + " first ");
            for (int e = i + 1; anogram.length > e; e++){
                char [] word2 = anogram[e].toCharArray();

//                System.out.println(word1  +  +);

                //System.out.println(anogram[i] + " second ");
                if (i != e){
                    Arrays.sort(word1);
                    Arrays.sort(word2);
                    //System.out.println(word2 + " Arreys");
                    if (Arrays.toString(word1).equals(Arrays.toString(word2))){
                        System.out.println(anogram[i] + " " + anogram[e]);
                    }
                }
            }
        }
//        System.out.println(anogram[0].length())
//        System.out.println(anogram.length);
//        char[] content = anogram[].toCharArray();
//        java.util.Arrays.sort(content);
//        for (int i = 0; anogram.length > i; i++){
//            char[] anogramm = anogram[i].toCharArray();
//            System.out.print(anogramm[i][]);
//        }



//        String str = "dfdfgfd";
//        System.out.println(str);
//
//        char[] ch = str.toCharArray();
//        System.out.println(ch[0]);
//
//        char c = 'd';
//        Arrays.sort(ch);
//        System.out.println("" + ch);

//        for (int word1 = 0; anogram.length >= word1; word1++) {
//            for (int word2 = 0; anogram.length >= word2; word2++) {
//                if (word1 != word2) {
//                    for (int leter1 = 0; anogram[leter1].length() > leter1; leter1++){
//                        for (int leter2 = 0; anogram[leter2].length() > leter2; leter2++){
//                            if (anogram[word1].charAt(leter1) == anogram[word2].charAt(leter2)){
//                                System.out.println(anogram[word1].charAt(leter1) + leter1 + " " + anogram[word2].charAt(leter2) + leter2);
//                            }
//                        }
//                    }
//                }
//            }
//        }
    }
}





