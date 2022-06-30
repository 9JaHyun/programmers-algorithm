package _09_sqrt;

public class Sol1 implements Question9{

    @Override
    public long solution(long n) {
        for (long i = 1; i<= n; i++) {
            if (n == i * i) {
                return (i + 1) * (i + 1);
            }
        }
        return -1;
    }
}
