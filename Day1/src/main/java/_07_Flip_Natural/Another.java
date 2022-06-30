package _07_Flip_Natural;

// 만약 자연수로 반환한다면??
public class Another {
    public long solution(long n) {
        long result = 0;
        while (n != 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }
}
