import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {2, 4, 7, 9, 5, 1, 2, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 3; j < 3; j++) {
                if (max == array[i]) {
                    max = array[j];
                    System.out.println(max);
                }
            }
        }
    }
}


//        boolean b = true;      1) задача
//        for (; true; ) {
//            String a = scanner.nextLine();
//            switch (a) {
//                case ("Троллейбус"):
//                    System.out.println("Правильно");
//                    break;
//                case ("Билбейм"):
//                    System.out.println("Туура жооп троллейбус");
//                default:
//                    System.out.println("Подумай еще!");
//            }
//            if (a.equals("Троллейбус")) {
//                break;
//            }
//       }
// 2) Задача
//        for (int i = 0; i <= 98; i += 7) {
//            System.out.println(i);
//
//        }
//        System.out.println("-------------------------------");
//        int a = 0;
//        while (a <= 98) {
//            System.out.println(a + " ");
//            a += 7;
//        }

// целые числа;
//        int f = scanner.nextInt(10);
//        for (int i = 0; i <= f; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//              }
//  return 0;



