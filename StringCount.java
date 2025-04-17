package com.codes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String[] input = {"Thanish"};
        String[] names = new String[input.length];
        int[] counts = new int[input.length];
        int uniqueIndex = 0;

        for (int i = 0; i < input.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (names[j].equals(input[i])) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                names[uniqueIndex] = input[i];
                counts[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }

        // Print the result
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(names[i] + " " + counts[i]);
        }
    }
}

/*Using collections
 
 * List<String> list = Arrays.asList("Thanish", "Neha", "Neha");
        Map<String, Integer> countMap = new LinkedHashMap<>();

        // Count the occurrences
        for (String name : list) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        // Print the result
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
*/
