package _02_DivisionArray;

import java.util.Arrays;

public class Sol2_Utils implements Question2 {

    @Override
    public int[] answer(int[] arr, int divisor) {
        int count = 0;
        int[] tempArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                tempArray[count] = arr[i];
                count++;
            }
        }

        // 미리 나누어 떨어지는게 없는 애들은 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 빈 배열은 0이 반환되기 때문에 숫자가 있는데까지 배열 복사
        int[] result = Arrays.copyOf(tempArray, count);

        // 정렬 유틸리티가 있다.
        Arrays.sort(result);
        return result;
    }
}
