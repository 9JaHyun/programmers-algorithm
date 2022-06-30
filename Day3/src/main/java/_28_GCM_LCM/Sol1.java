package _28_GCM_LCM;

import java.util.Arrays;

public class Sol1 implements Question28{

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(Arrays.toString(sol1.solution(1000000, 1000000)));
    }

    @Override
    public int[] solution(int n, int m) {
        // 유클리드 호제법
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        // 최대 공배수 = 두 수의 곱 / 최대공약수
        return new int[] { a, n * m / a };
    }
}
