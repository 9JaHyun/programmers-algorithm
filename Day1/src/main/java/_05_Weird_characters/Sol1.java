package _05_Weird_characters;

// sol1 무식하게 풀기
public class Sol1 implements Question5{

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(sol1.solution("try hello world"));
        System.out.println(sol1.solution("aaa  aa a"));
    }

    @Override
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                idx = 0;
            } else {
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i])
                      : Character.toLowerCase(chars[i]));
            }
        }
        return String.valueOf(chars);
    }
}
