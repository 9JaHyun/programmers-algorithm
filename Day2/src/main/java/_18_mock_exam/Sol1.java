package _18_mock_exam;

import java.util.ArrayList;

public class Sol1 implements Question18 {

    private final int[] PATTERN_1 = new int[]{1, 2, 3, 4, 5};
    private final int[] PATTERN_2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    private final int[] PATTERN_3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(new int[]{1, 2, 3, 4, 5});
    }

    @Override
    public int[] solution(int[] answers) {
        int[] answer = {};
        int answer1 = 0, answer2 = 0, answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            int a = i % PATTERN_1.length;
            int b = i % PATTERN_2.length;
            int c = i % PATTERN_3.length;

            if (PATTERN_1[a] == answers[i]) {answer1++;}
            if (PATTERN_2[b] == answers[i]) {answer2++;}
            if (PATTERN_3[c] == answers[i]) {answer3++;}
        }

        int max = Math.max(Math.max(answer1, answer2), answer3);
        ArrayList<Integer> list = new ArrayList<>();
        if (max == answer1) list.add(1);
        if (max == answer2) list.add(2);
        if (max == answer3) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
