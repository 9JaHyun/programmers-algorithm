package _33_gym_suit;


public class Sol1 implements Question33 {

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
    }

    @Override
    public int solution(int n, int[] lost, int[] reserve) {
        int[] list = new int[n];
        // 세팅 단계. 여유분 : 1 / 딱 하나 : 0 / 분실 : -1
        for (int i = 0; i < list.length; i++) {
            // 체육복 분실 시 -1
            if (lost.length > i) {
                list[lost[i] - 1]--;
            }
            // 체육복 여유분 있을 때 +1
            if (reserve.length > i) {
                list[reserve[i] - 1]++;
            }
        }

        // 수업에 참여할 수 있는 학생 수
        int studentCount = 0;

        // 학생 체육복 배분
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] + list[i + 1] == 0) {
                list[i] = 0;
                list[i + 1] = 0;
            }
        }

        // 수업에 참여할 수 있는 학생 수 카운트
        for (int i : list) {
            if (i >= 0) {
                studentCount++;
            }
        }

        return studentCount;
    }
}
