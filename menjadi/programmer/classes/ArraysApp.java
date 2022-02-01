package menjadi.programmer.classes;

import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {

        int[] numbers = {
                23, 3, 4, 5, 1, 43,7,212,324,33
        };

        System.out.println(Arrays.binarySearch(numbers, 1));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 23));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 3, 9);
        System.out.println(Arrays.toString(result2));
    }

}
