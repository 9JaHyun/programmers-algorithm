public class Test1 {

    public int solution(int[] checkIn, int[] checkOut) {
        int answer = 0;
        for (int i = 0; i < checkIn.length; i++) {
            //새벽 5시 즉 29시 부터는 체크아웃을 깜빡한 것으로 간주. => 오후 9시 체크아웃으로..
            if (checkOut[i] >= 29) {
                answer += (21 - checkIn[i]);
            } else {
                answer += checkOut[i] - checkIn[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test1 q1 = new Test1();
        int a1 = q1.solution(new int[]{9, 9, 8, 8, 7, 8, 9}, new int[]{21, 25, 30, 29, 22, 23, 30});
        int a2 = q1.solution(new int[]{9, 7, 8, 9, 7, 9, 8}, new int[]{23, 22, 26, 26, 29, 27, 22});
        System.out.printf("q1's answer is %d %n and q2's answer is %d", a1, a2);
    }
}
