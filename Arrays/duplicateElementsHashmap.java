package Arrays;

import java.util.HashMap;
import java.util.Map;

public class duplicateElementsHashmap {
    public static void main(String[] args) {
        int[] arr = {4, -2, 3, 4, -2, 3, 5, 6, -2, 4};

        // Map to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicate elements with their frequency
        System.out.println("Duplicate elements and their frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

