package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test extends CountLetter{
    public static final String bug = "bug";

    public static void main(String[] args) {



                ArrayList<String> words = new ArrayList<>();
                words.add("Hello world!");
                words.add("Amigo");
                words.add("Elly");
                words.add("Kerry");
                words.add("Bug");
                words.add("bug");
                words.add("Easy ug");
                words.add("Risha");

                ArrayList<String> copyWordsFirst = new ArrayList<>(words);
                ArrayList<String> copyWordsSecond = new ArrayList<>(words);
                ArrayList<String> copyWordsThird = new ArrayList<>(words);

                removeBugWithFor(copyWordsFirst);
                removeBugWithWhile(copyWordsSecond);
                removeBugWithCopy(copyWordsThird);

                copyWordsFirst.forEach(System.out::println);
                String line = "_________________________";
                System.out.println(line);
                copyWordsSecond.forEach(System.out::println);
                System.out.println(line);
                copyWordsThird.forEach(System.out::println);
                System.out.println(line);
            }

            public static void removeBugWithFor(ArrayList<String> list) {
                //напишите тут ваш код
                for(int i = 0; list.size() > i; i++){
                    String str = list.get(i);
                    if(str.equalsIgnoreCase(bug)){
                        list.remove(str);
                        i--;
                    }

                }
            }

            public static void removeBugWithWhile(ArrayList<String> list) {
                //напишите тут ваш код
                Iterator<String> it = list.iterator();
                while(it.hasNext()){
                    String str = it.next();
                    if(bug.equalsIgnoreCase(str)){
                        it.remove();
                    }
                }
            }

            public static void removeBugWithCopy(ArrayList<String> list) {
                //напишите тут ваш код
                ArrayList<String> newList = new ArrayList<>(list);
                for(String S: newList){
                    if(bug.equalsIgnoreCase(S)){
                        list.remove(S);

                    }
                }
            }
        }




