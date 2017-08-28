package org.antonu;

import java.util.Random;

/**
 * Created by kit on 4/28/17.
 */
public class Util {

    private static Random random = new Random();

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static int randomInt(int min, int max) {
        return min + random.nextInt(max + 1);
    }

    public static boolean arraySearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}
