import java.util.Arrays;

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
    
    public static void main(String[] args) {
        
    }
}
