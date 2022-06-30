package _35_secret_map;

import java.util.Arrays;

// 비트 OR 연산
public class Sol1 implements Question35 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(Arrays.toString(
              sol1.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(
              sol1.solution(5, new int[]{30, 1, 8, 1, 1}, new int[]{30, 1, 8, 16, 0})));
    }

    @Override
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        byte[] map = new byte[n];
        for (int i = 0; i < n; i++) {
            map[i] = (byte) ((byte) arr1[i] | arr2[i]);
        }
        System.out.println(Arrays.toString(map));

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            byte b = map[i];
            for (int j = 0; j < n; j++) {
                if ((b & 1) == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
                b >>= 1;
            }
            answer[i] = sb.reverse().toString();
            System.out.println("[" + answer[i] + "]");
        }
        return answer;
    }
}
