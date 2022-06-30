package _06_Add_Digits;

// 타입 캐스팅: 이런게 있다 정도만
public class Sol2 implements Question6{

    @Override
    public int solution(int n) {
        String s = String.valueOf(n);
        String[] split = s.split("");
        int result = 0;
        for (String element : split) {
            result += Integer.parseInt(element);
        }

        return result;
    }
}
