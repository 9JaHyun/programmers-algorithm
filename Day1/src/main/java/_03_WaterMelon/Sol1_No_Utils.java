package _03_WaterMelon;

// 가장 기본방식
public class Sol1_No_Utils implements Question3 {

    public String answer(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            result += (i % 2 == 0 ? "박" : "수");
        }

        return result;
    }

    // 개선 1
    public String answer2(int n) {
        String result = "";

        boolean isEven = (n % 2 == 0);
        if (isEven) {
            for (int i = 0; i < n / 2; i++) {
                result += "수박";
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                result += "수박";
            }
            result += "수";
        }

        return result;
    }

    // 개선 2
    public String answer3(int n) {
        String result = "";

        for (int i = 0; i < n / 2; i++) {
            result += "수박";
        }

        if (n / 2 != 0) {
            result += "수";
        }

        return result;
    }

}
