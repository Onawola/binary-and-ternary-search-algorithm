package search;

import java.util.Random;

public class RandomArray {
    public static int[] generateRandomArray(int size) {
        int[] arrayNumber = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayNumber[i] = random.nextInt(100) + 1;
        }
        return arrayNumber;
    }
}
