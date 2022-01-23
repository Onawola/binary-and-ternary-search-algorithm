package search;

import java.util.Scanner;

public class TernarySearchTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = entry.nextInt();
        //initialize unsorted array with random values
        int[] randomArray = RandomArray.generateRandomArray(size);
        int lookFor = 120;  //number to look for in the array
        long startTime = System.nanoTime();
        int elementAt = TernarySearch.ternarySearch(randomArray, 0, size - 1, lookFor);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Elapsed Time for ternary search for unsorted array in nano seconds: " + duration);
        if (elementAt == -1){  //if not present in array
            System.out.println("The element "+lookFor+ " is not present.");
        }
        else{
            System.out.println("The element " + lookFor + " is in position " +
                    "["+elementAt+"]");
        }
        entry.close();
    }
}
