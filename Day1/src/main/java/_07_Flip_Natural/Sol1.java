package _07_Flip_Natural;

public class Sol1 implements Question7{

    @Override
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int count = 0;
        int[] result = new int[length];

        while (n != 0) {
            result[count] = (int) (n % 10);
            count += 1;
            n /= 10;
        }

        return result;
    }
}
