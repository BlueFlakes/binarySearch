package algorithms;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static boolean search(List<Integer> collection, Integer toFind) {

        int low = 0;
        int high = collection.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            Integer pivot = collection.get(mid);

            if (toFind > pivot) {
                low = mid + 1;
            } else if (toFind < pivot) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> container = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (Integer value : container) {
            System.out.println(search(container, value));
        }
    }
}
