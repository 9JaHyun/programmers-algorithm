package _34_phoneketmon;

import java.util.Arrays;

public class Sol2 implements Question34 {

    public static void main(String[] args) {
        Sol2 sol1 = new Sol2();
        System.out.println(sol1.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol1.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol1.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    @Override
    public int solution(int[] nums) {
        // 중복 제거
        int count = (int) Arrays.stream(nums)
              .distinct()
              .count();

        return Math.min((nums.length / 2), count);
    }

}
