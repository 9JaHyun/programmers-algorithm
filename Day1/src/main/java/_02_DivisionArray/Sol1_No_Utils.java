package _02_DivisionArray;

public class Sol1_No_Utils implements Question2 {

    @Override
    public int[] answer(int[] arr, int divisor) {
        int count = 0, temp = 0;
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

        int[] result = new int[count];

        // 빈 배열은 0이 반환되기 때문에 숫자가 있는데까지 배열 복사
        for (int i = 0; i < count; i++) {
            if (tempArray[i] != 0) {
                result[i] = tempArray[i];
            }
        }

        // Swaping
        for (int i = result.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }
}
