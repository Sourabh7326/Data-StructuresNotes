public class SecondLargestSmallest {
    
    public static int findSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array size must be at least 2");
            return Integer.MIN_VALUE;
        }
        
        int first, second;
        first = second = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            // Update the largest and second largest elements
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        
        return second;
    }
    
    public static int findSecondSmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array size must be at least 2");
            return Integer.MAX_VALUE;
        }
        
        int third, fourth;
        third = fourth = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            // Update the smallest and second smallest elements
            if (arr[i] < third) {
                fourth = third;
                third = arr[i];
            } else if (arr[i] < fourth && arr[i] != third) {
                fourth = arr[i];
            }
        }
        
        return fourth;
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int secondLargest = findSecondLargest(arr);
        int secondSmallest = findSecondSmallest(arr);
        
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
