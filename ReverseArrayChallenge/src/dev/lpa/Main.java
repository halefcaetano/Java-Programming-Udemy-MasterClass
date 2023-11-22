package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array2 = {2, 3, 4, 5, 6};
        int [] returnedArray = reverse(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(returnedArray));

    }
    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = array.length; i < 0; i++) {
            newArray[count] = array[i];
            count++;
            System.out.println(count);
        }
        return newArray;
    }

}

