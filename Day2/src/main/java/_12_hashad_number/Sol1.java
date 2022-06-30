package _12_hashad_number;

// Main Idea x값을 하나 복사해라
public class Sol1 implements Question12{

    @Override
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0;
    }
}
