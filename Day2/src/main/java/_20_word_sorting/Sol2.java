package _20_word_sorting;

import java.util.Arrays;

public class Sol2 implements Question20{

    @Override
    public String solution(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
