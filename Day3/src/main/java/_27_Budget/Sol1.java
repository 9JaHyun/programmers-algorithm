package _27_Budget;

import java.util.Arrays;

public class Sol1 implements Question27{

    @Override
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] < 0) {
                return i;
            }
            System.out.println("can pay");
            budget -= d[i];
        }
        return d.length;
    }
}
