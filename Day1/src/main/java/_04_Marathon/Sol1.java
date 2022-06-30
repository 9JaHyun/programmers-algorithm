package _04_Marathon;

import java.util.Arrays;

public class Sol1 implements Question4 {

    @Override
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(sol1.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
              new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
}
