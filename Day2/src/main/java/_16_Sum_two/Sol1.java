package _16_Sum_two;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set 사용
 *  - Set은 중복 허용을 하지 않음.
 *
 * TreeSet
 *  - MaxTree, MinTree 처럼 일정 수준 Elements들의 순서를 보장함.
 */
public class Sol1 implements Question16 {


    @Override
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>(); // 중복 허용 X

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] result = new int[set.size()];
        int idx = 0;
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            result[idx] = iterator.next();
            idx++;
        }
        return result;
    }
}
