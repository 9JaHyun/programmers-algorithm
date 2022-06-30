package _13_flip_ternary;

// String + 숫자 => 문자열이 이어붙여진다.
public class Sol3 implements Question13 {

    @Override
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append((n % 3));
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
