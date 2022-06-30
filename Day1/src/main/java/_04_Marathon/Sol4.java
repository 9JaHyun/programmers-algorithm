package _04_Marathon;

import java.util.HashMap;

public class Sol4 implements Question4 {

    public static void main(String[] args) {
        Sol4 sol4 = new Sol4();
        sol4.solution(new String[]{"mislav", "mislav", "stanka", "stanko", "ana"},
              new String[]{"ana", "stanka", "stanko", "mislav"});
    }

    @Override
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.compute(participant[i], (k, v) -> v != null ? null : 1);
            if (i < completion.length) {
                map.compute(completion[i], (k, v) -> v != null ? null : 1);
            }
        }
        return map.keySet().iterator().next();
    }
}
