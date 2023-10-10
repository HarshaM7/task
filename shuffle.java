import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shuffle {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list for shuffling
        List<Integer> list = Arrays.asList(arr);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        arr = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(arr));
    }
}
