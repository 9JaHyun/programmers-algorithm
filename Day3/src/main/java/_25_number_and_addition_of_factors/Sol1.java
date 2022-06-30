package _25_number_and_addition_of_factors;

// 무식하게 풀기
public class Sol1 implements Question25{

    @Override
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int factorsCount = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    factorsCount++;
                }
            }
            if (factorsCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        String s = "";

        return answer;
    }
}
