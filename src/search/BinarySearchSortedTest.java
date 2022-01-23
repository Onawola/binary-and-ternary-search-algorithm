package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSortedTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = entry.nextInt();
        //initialize unsorted array with random values
        int[] randomArray = RandomArray.generateRandomArray(size);
        //sort routine
        Arrays.sort(randomArray);
        int lookFor = 120;  //number to look for in the array
        long startTime = System.nanoTime();
        int elementAt = BinarySearch.binarySearch(randomArray, 0, size - 1, lookFor);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Elapsed Time for binary search for sorted array in nano seconds: " + duration);
        String result = elementAt < 0 ? "Element not found." : "Element is at index " + elementAt;
        System.out.println(result);
        entry.close();
    }
}
