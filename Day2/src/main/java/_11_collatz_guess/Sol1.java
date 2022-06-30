package _11_collatz_guess;

// 이런 증명을 구현하라는 문제는 말하는대로 풀어야 함.
// 핵심은 int 오버플로를 주의하라.
public class Sol1 implements Question11 {

    @Override
    public int solution(int num) {
        long longNum = (long) num;
        if (longNum == 1) {
            return 0;
        }

        int count = 0;
        while (longNum != 1) {
            count++;
            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum *= 3;
                longNum += 1;
            }

            if (count >= 500) {
                return -1;
            }
        }
        return count;
    }

    public int byForStatement(int num) {
        long longNum = (long) num;

        for (int i = 0; i < 500; i++) {
            if (longNum == 1) {
                return i;
            }

            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum *= 3;
                longNum += 1;
            }
        }
        return -1;
    }
}
