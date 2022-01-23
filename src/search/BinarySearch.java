package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    //Binary Search over array indices
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1; // avoid overflow
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1); // key not found.
    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = entry.nextInt();
        int[] randomArray = RandomArray.generateRandomArray(size);
        System.out.println(Arrays.toString(randomArray));
//        Arrays.binarySearch(randomArray, 1, 10000, 70);
        System.out.println(randomArray.length);
        int elementAt = binarySearch(randomArray, 0, size - 1, 70);
        String result = elementAt < 0 ? "Element not found." : "Element is at index " + elementAt;
        System.out.println(elementAt);
        System.out.println(result);


        //        System.out.println(i);
//        System.out.println("Before: " + Arrays.toString(randomArray));
//        long startTime = System.nanoTime();
//        int[] sortedArray = pancakeSort(randomArray);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
//        System.out.println("Elapsed Time for pancake sort in nano seconds: " + duration);
//        System.out.println("Later:  " + Arrays.toString(sortedArray));
        entry.close();
    }
}
