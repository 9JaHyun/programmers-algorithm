package _03_WaterMelon;

/**
 * String Object의 경우에는 append 시 계속 새로운 String Instance을 생성한다. 최적화가 매우 불리하기 때문에 이런 경우 StringBuilder을
 * 사용하면 조금 더 효율이다.
 */
public class Sol2_StringBuilder implements Question3 {

    @Override
    public String answer(int n) {
        StringBuilder result = new StringBuilder();

        boolean isEven = (n % 2 == 0);

        for (int i = 0; i < n / 2; i++) {
            result.append("수박");
        }
        if (!isEven) {
            result.append("수");
        }

        return result.toString();
    }
}
