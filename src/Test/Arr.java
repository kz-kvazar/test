package Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
//ctr+alt+shift+L

public class Arr {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arr = new ArrayList<>() {
            {
                add(1);
                add(3);
                add(7);
            }
        };
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(7));
        arr.remove(1);
        System.out.println(arr.contains(3));
        arr.add(2, 77);
        arr.trimToSize(); // оптимизация массива

        System.out.println(arr);
        System.out.println(arr.size());


        for (int i = 0; i < 1; i++) {
            System.out.println("Случайное число " + (int) (Math.random() * 6));
            TimeUnit.SECONDS.sleep(1);
            int rnd = ThreadLocalRandom.current().nextInt(5, 15);
            int and = randomInARange(0,9);
           // if(randomInARange(0,9) == 9? mine = false: mine  = true );

            System.out.println(rnd);
            int min = 0;
            int max = 100;
            int mRnd = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(mRnd);
        }

        Map<Integer, Integer> map = new TreeMap<>();

        // За 10000 операций
        for (int i = 0; i < 10000; i++) {

            // Сгенерируем рандомное число от -10 включительно до 10 включительно
            final Integer randomNumber = randomInARange(-10, 10);
            int intel = randomNumber.intValue();

            if (!map.containsKey(randomNumber)) {
                // Если карта еще не содержит "выпавшего случайного числа"
                // Положим его в карту с кол-вом выпадений = 1
                map.put(randomNumber, 1);
            } else {
                // Иначе, увеличим количество выпадений данного числа на 1
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }

        // Выведем на экран содержимое карты в формате ключ=[значение]
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.printf("%d=[%d]%n", entry.getKey(), entry.getValue());
        }
        System.out.println(Math.ceil(10_000_000L));
        System.out.printf("Width=%d, Height=%d%n", 10, 15);
    }
    static int randomInARange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}

