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

    public static void main(String[] args) {
        
    }
}
