package _32_fail_rate;

import java.util.ArrayList;
import java.util.List;

public class Sol1 implements Question32 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

    @Override
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double users = stages.length;
        //{스테이지 번호, 실패율}
        List<double[]> failRate = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int challenger = 0;
            for (int stage : stages) {
                if (i == stage) {
                    challenger++;
                }
            }
            // challenger가 0명이면 모두 통과 => 실패율 = 0
            if (challenger == 0) {
                failRate.add(new double[]{i, 0});
                continue;
            }

            // 일단 1스테이지는 모두 패스를 했거나 도전중 => 전체 유저로 나누기 가능.
            failRate.add(new double[]{i, challenger / users});

            // 그 후 다음 스테이지는 도전자만큼 빼야 한다.
            users -= challenger;
        }

        failRate.sort((a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < failRate.size(); i++) {
            answer[i] = (int) failRate.get(i)[0];
        }

        return answer;
    }
}
