package _29_k_num;

import java.util.Arrays;

public class Sol1 implements Question29{

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    @Override
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];

            int[] copyArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(copyArr);
            result[i] = copyArr[command[2] - 1];
        }

        return result;
    }
}
