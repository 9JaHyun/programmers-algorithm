package _05_Weird_characters;

import java.util.Arrays;

public class Sol2 implements Question5 {

    public static void main(String[] args) {
        Sol2 sol2 = new Sol2();
        System.out.println(sol2.solution("try hello world"));
        System.out.println(sol2.solution("aaa  aa a"));
    }

    @Override
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        System.out.println(Arrays.toString(str));

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            sb.append(str[i]);
        }

        return sb.toString();
    }
}
