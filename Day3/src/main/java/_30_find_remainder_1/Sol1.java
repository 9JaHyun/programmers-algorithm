package _30_find_remainder_1;


public class Sol1 implements Question30{

    @Override
    public int solution(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        // 없으면 n-1
        return n - 1;
    }
}
