package _02_DivisionArray;

import java.util.Arrays;

public class Sol3_UsingStream implements Question2 {

    @Override
    public int[] answer(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
              .filter(e -> e % divisor == 0)
              .sorted()
              .toArray();
        if (result.length == 0) {
            return new int[]{-1};
        }
        return result;
    }
}
