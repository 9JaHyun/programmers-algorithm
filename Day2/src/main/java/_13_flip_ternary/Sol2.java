package _13_flip_ternary;

import java.util.Stack;

// Stack로 집어넣으면 알아서 뒤집힌다.
public class Sol2 implements Question13 {

    @Override
    public int solution(int n) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            stack.push(n % 3);
            n /= 3;
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int element = stack.pop();
            if (element == 0) {
                continue;
            }
            result = (int) (result + Math.pow(3, i) * element);
        }
        return result;
    }
}
