package _02_Test;

import _02_DivisionArray.Question2;
import _02_DivisionArray.Sol1_No_Utils;
import _02_DivisionArray.Sol2_Utils;
import _02_DivisionArray.Sol3_UsingStream;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestApp {

    private Question2 q1 = new Sol1_No_Utils();
    private Question2 q2 = new Sol2_Utils();
    private Question2 q3 = new Sol3_UsingStream();

    @DisplayName(value = "2번문제 테스트")
    @Test
    void test() {
        List<Question2> solutions = List.of(q1, q2, q3);

        for (Question2 solution : solutions) {
            long start = System.currentTimeMillis();
            Assertions.assertArrayEquals(new int[]{5, 10}, solution.answer(new int[]{5, 9, 7, 10}, 5));
            Assertions.assertArrayEquals(new int[]{1, 2, 3, 36}, solution.answer(new int[]{2, 36, 1, 3}, 1));
            Assertions.assertArrayEquals(new int[]{-1}, solution.answer(new int[]{3, 2, 6}, 10));
            long time = System.currentTimeMillis() - start;
            System.out.printf("%s takes %d ms %n", solution.getClass().getSimpleName(), time);
        }
    }
}
