package org.antonu;

/**
 * Created by kit on 4/28/17.
 */
public class Quicksort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[i + (j - i) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                i++;
                j--;
            }
        }
        if (j > low) {
            quickSort(array, low, j);
        }
        if (i < high) {
            quickSort(array, i, high);
        }
    }
}
