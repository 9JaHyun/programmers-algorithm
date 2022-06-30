package _06_Add_Digits;

// 10의 나머지로 풀기
public class Sol1 implements Question6 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(sol1.solution(1111111));
        System.out.println(sol1.solution(1000000));
        System.out.println(sol1.solution(0000001));
    }

    @Override
    public int solution(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
