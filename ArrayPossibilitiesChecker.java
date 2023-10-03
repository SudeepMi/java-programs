public class ArrayPossibilitiesChecker {
    public static int isAllPossibilities(int[] A) {
        if (A.length == 0) {
            return 0; // An empty array cannot be an array of all possibilities
        }

        boolean[] visited = new boolean[A.length];

        for (int num : A) {
            if (num < 0 || num >= A.length || visited[num]) {
                return 0; // The array does not contain all possibilities
            }
            visited[num] = true;
        }

        for (boolean isVisited : visited) {
            if (!isVisited) {
                return 0; // The array is missing some elements between 0 and A.length-1
            }
        }

        return 1; // The array is an array of all possibilities
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 3};
        int[] arr2 = {0, 2, 3};
        int[] arr3 = {0, 1, 2, 3, 4};

        System.out.println(isAllPossibilities(arr1)); // Output: 1
        System.out.println(isAllPossibilities(arr2)); // Output: 0
        System.out.println(isAllPossibilities(arr3)); // Output: 1
    }
}
