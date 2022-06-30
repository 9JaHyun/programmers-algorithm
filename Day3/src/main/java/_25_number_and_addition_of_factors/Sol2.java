package _25_number_and_addition_of_factors;

// 정수론 - 소인수분해를 이용
// -> 제곱수의 약수는 항상 홀수
public class Sol2 implements Question25{

    @Override
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else{
                answer += i;
            }
        }
        return answer;
    }
}
