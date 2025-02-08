import java.util.Arrays;
import java.util.Random;

public class Algorithm_2 {
    
    public static int findSmallestMissing(int[] arr) {
        Arrays.sort(arr); // Time complexity: O(n log n)
        
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
        
    }
}
