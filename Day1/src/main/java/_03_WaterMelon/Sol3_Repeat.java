package _03_WaterMelon;

/**
 * String Repeat 함수
 *  - 반복문이 지겹다면 String.repeat 함수를 사용해보자.
 *  - 복사한 ByteArray를 append 하는 방식
 */
public class Sol3_Repeat implements Question3 {

    @Override
    public String answer(int n) {
        StringBuilder result = new StringBuilder();

        boolean isEven = (n % 2 == 0);
        if (isEven) {
            result.append("수박".repeat(Math.max(0, n / 2)));
        } else {
            result.append("수박".repeat(Math.max(0, n / 2)));
            result.append("수");
        }

        return result.toString();
    }

    // 코드 중복 제거
    public String answer2(int n) {
        StringBuilder result = new StringBuilder();

        boolean isEven = (n % 2 == 0);
        result.append("수박".repeat(Math.max(0, n / 2)));
        if (!isEven) {
            result.append("수");
        }

        return result.toString();
    }
}
