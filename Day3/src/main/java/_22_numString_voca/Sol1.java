package _22_numString_voca;

public class Sol1 implements Question22{

    private final String[] number = {"zero", "one", "two", "three", "four", "five", "six",
          "seven", "eight", "nine"};

    @Override
    public int solution(String s) {
        for (int i = 0; i < number.length; i++) {
            s = s.replace(number[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
