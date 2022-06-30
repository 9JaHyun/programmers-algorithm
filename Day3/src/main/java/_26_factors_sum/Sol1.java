package _26_factors_sum;

public class Sol1 implements Question26 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(12);
    }

    @Override
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        System.out.println(answer + n);
        return answer + n;
    }
}
