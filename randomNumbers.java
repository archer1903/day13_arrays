package day13_Arrays;

import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random rand = new Random();
        int numberRandom=rand.nextInt();

        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers[i]=(int)Math.round(Math.random()*100);
            System.out.println(numbers[i]);
        }


    }

}
