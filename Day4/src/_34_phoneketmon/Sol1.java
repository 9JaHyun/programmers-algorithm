package _34_phoneketmon;

import java.util.HashSet;
import java.util.Set;

public class Sol1 implements Question34 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(sol1.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol1.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol1.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    @Override
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min((nums.length / 2), set.size());
    }

}
