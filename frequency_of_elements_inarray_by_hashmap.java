import java.util.HashMap;
import java.util.Map;

public class frequency_of_elements_inarray_by_hashmap {
    


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 4, 5, 4};

        // Using a HashMap to count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}


