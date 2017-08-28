package org.antonu;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.antonu.Util.arraySearch;
import static org.antonu.Util.randomInt;

/**
 * Created by kit on 4/28/17.
 */
public class QuicksortTest {

    private int[] array;
    private int length = 16;
    private Quicksort sorter = new Quicksort();

    @Before
    public void setUp() throws Exception {
        Thread.sleep(1000);
//        randomFill();
        constantFill();
    }

    private void constantFill() {
        array = new int[]{
                2, 6, 8, 1, 7, 5, 4, 3
        };
    }

    private void randomFill() {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            int rand;
            do {
                rand = randomInt(1, length);
            }
            while (arraySearch(array, rand));
            array[i] = rand;
        }
    }



    @Test
    public void sort() throws Exception {
        Util.arrayPrint(array);
        sorter.sort(array);
        Util.arrayPrint(array);
    }
}
