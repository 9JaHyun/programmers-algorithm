package _31_find_prime;

// 이미 풀어봤던 문제다!
// 에라토스테네스의 체
public class Sol2 implements Question31 {

    @Override
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true; //2~n번째수를 true로 초기화
        }

        //제곱근 구하기
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) { //2~루트n까지 검사
            if (prime[i]) { //i번째의 수가 소수일 때
                for (int j = i; i * j <= n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문)
                {
                    prime[i * j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                answer++;
            }
        }
        return answer;
    }
}
