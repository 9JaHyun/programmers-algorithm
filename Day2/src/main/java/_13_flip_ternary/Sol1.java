package _13_flip_ternary;

// 기본적인 연산
public class Sol1 implements Question13 {

    @Override
    public int solution(int n) {
        long ternary = 0;

        // 나머지를 끝에서부터 입력하면 뒤집는 과정이 필요가 없어진다.
        while (n > 0) {
            ternary = (n % 3) + ternary * 10;
            n /= 3;
        }

        int powCount = 0;
        int result = 0;
        while (ternary > 0) {
            result += Math.pow(3, powCount) * (ternary % 10);
            powCount++;
            ternary /= 10;
        }
        return result;
    }
}
