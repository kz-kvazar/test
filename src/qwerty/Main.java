package qwerty;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scS = new Scanner(System.in);

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


    }
}





