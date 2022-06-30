package _09_sqrt;

// Math 내장 함수 사용.
// 이 경우 double -> long 시 오버플로 주의하자.
public class Sol2 implements Question9{

    @Override
    public long solution(long n) {
        long answer = 0;
        if (Math.pow(Math.sqrt(n), 2) == n) {
            answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return answer;
    }
}
