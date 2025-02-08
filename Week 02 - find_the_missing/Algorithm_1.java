import java.util.Arrays;

public class Algorithm_1 {
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

    public static void main(String[] args) {
        int[] input = {2, 7, 4, 0, 3, 2, 5, 1, 0, 3};
        int result = findSmallestMissing(input);
        System.out.println("The smallest missing number is: " + result);
    }

}