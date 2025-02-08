import java.util.Arrays;
import java.util.Random;

public class Algorithm_3 {

    public static int findSmallestMissing(int[] arr) {
        int missingNumber = 0;
        for (int num : arr) {
            if (num == missingNumber) {
                missingNumber++;
            } else if (num > missingNumber) {
                break;
            }
        }
        return missingNumber;
    }

    public static int[] createInput(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {100000, 200000, 400000, 800000, 1600000}; // Adjust these sizes to aim for ~1 second runtime
        boolean sort = true;
        
        for (int size : sizes) {
            int[] input = createInput(size);
            if (sort) {
                Arrays.sort(input); // Ensure the input is sorted
            }
            
            long startTime = System.nanoTime();
            int result = findSmallestMissing(input);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
            System.out.println("Input size: " + size + " -> Time taken: " + duration + " ms, Result: " + result);
        }
    }
}
