package day13_Arrays;

import java.sql.Array;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers=new int[5];
        boolean[] values=new boolean[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
