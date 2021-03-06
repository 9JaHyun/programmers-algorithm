package _03_Test;

import _03_WaterMelon.Question3;
import _03_WaterMelon.Sol1_No_Utils;
import _03_WaterMelon.Sol2_StringBuilder;
import _03_WaterMelon.Sol3_Repeat;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestApp {

    private Question3 q1 = new Sol1_No_Utils();
    private Question3 q2 = new Sol2_StringBuilder();
    private Question3 q3 = new Sol3_Repeat();

    @DisplayName(value = "3번문제 테스트")
    @Test
    void test() {
        List<Question3> solutions = List.of(q1, q2, q3);

        for (Question3 solution : solutions) {
            long start = System.currentTimeMillis();
            Assertions.assertEquals("수박수", solution.answer(3));
            Assertions.assertEquals("수박수박", solution.answer(4));
            Assertions.assertEquals("수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  + "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박"
                  , solution.answer(3516));

            long time = System.currentTimeMillis() - start;
            System.out.printf("%s takes %d ms %n", solution.getClass().getSimpleName(), time);
        }
    }
}
