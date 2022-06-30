package _20_word_sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Sol1 implements Question20{

    @Override
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");

        Arrays.sort(split, Comparator.reverseOrder());
        for (String s1 : split) {
            sb.append(s1);
        }
        return sb.toString();
    }
}
