package Arrays;

class duplicateElementsLoop {
    public static void main(String[] args) {
        int[] arr = {4, -2, 3, 4, -2, 3, 5, 6, -2, 4};
        int n = arr.length;
        boolean[] visited = new boolean[n]; // Track visited elements

        System.out.println("Duplicate elements and their frequency:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // Skip already counted elements

            int count = 1; // Start count as 1 for the current element

            for (int j = i + 1; j < n; j++) { // Count occurrences
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark duplicate as visited
                }
            }

            if (count > 1) { // Print only duplicate elements
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}