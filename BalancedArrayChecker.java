public class BalancedArrayChecker {
    public static int isBalanced(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                return 0; // Even-indexed elements should be even
            } else if (i % 2 != 0 && arr[i] % 2 == 0) {
                return 0; // Odd-indexed elements should be odd
            }
        }
        return 1; // The array is balanced
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6, 5, 4, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = {1, 3, 5, 7, 9};
        
        System.out.println(isBalanced(arr1)); // Output: 1 (Balanced)
        System.out.println(isBalanced(arr2)); // Output: 0 (Not balanced)
        System.out.println(isBalanced(arr3)); // Output: 1 (Balanced)
    }
}