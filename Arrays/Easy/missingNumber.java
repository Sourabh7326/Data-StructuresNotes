public class missingNumber {
    // Brute force -> (sum of N) - (sum of Array) = Missing Number

    // Optimal Approach -> Bitwise Xor
    public static int findMissingNum(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }
   

    public static void main(String[] args) {
       int[] nums = {1 , 3 , 4, 5 , 6};
       System.out.println(findMissingNum(nums , nums.length));
    }
}
