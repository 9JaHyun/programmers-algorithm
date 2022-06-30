package _16_Sum_two;

import java.util.ArrayList;
import java.util.List;

// Stream -> 대용량 처리가 아니면 느림.
public class Sol2 implements Question16 {

    @Override
    public int[] solution(int[] numbers) {
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sum = numbers[i] + numbers[j];
                    result.add(sum);
                }
        }
        return result.stream().distinct()
              .sorted()
              .mapToInt(i -> i)
              .toArray();
    }
}