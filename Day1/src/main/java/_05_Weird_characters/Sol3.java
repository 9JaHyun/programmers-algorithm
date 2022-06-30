package _05_Weird_characters;

public class Sol3 implements Question5 {

    @Override
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String[] array = s.split("");

        for (String str : array) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            sb.append(cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase());
        }
        return sb.toString();
    }
}
