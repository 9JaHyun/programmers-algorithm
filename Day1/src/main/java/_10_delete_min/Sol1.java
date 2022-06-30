package _10_delete_min;

// 기본적인 풀이
public class Sol1 implements Question10{

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(new int[]{4, 3, 2, 1});
    }

    @Override
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int index = 0;
        int[] result = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[counter] = arr[i];
                counter++;
            }
        }
        return result;
    }
}
