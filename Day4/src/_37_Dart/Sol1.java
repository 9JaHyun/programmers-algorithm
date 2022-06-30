package _37_Dart;

public class Sol1 implements Question37{

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        sol1.solution("1S2D*3T");
        sol1.solution("1D2S#10S");
        sol1.solution("1D2S0T");
        sol1.solution("1S*2T*3S");
        sol1.solution("1D#2S*3S");
        sol1.solution("1T2D3D#");
        sol1.solution("1D2S3T*");
    }

    @Override
    public int solution(String dartResult) {
        int[] scores = new int[3];
        char[] carr = dartResult.toCharArray();
        // 인덱스 조정을 위해 -1부터 시작 매 반복마다 증가시켜야 하는데 첫 번째 반복에서는 0이 되도록
        int idx = -1;
        for (int i=0;i<carr.length;i++) {
            // n번째 라운드에 쏜 점수가 0~9인 경우
            if (carr[i] >= '0' && carr[i] <= '9') {
                idx++; // 이전 라운드에서 현재 라운드로 증가된 것 (-1 -> 0)
                // 점수 추가
                scores[idx] += Integer.parseInt(String.valueOf(carr[i]));
                // n번째 라운드에 쏜 점수가 10점인 경우
                if (i+1!=carr.length-1 && carr[i+1] == '0'&& carr[i] == '1') {
                    scores[idx] -= Integer.parseInt(String.valueOf(carr[i]));
                    scores[idx] = 10;
                    i++;
                }
            } else if (carr[i] == 'D') { // 보너스 Double
                scores[idx] *= scores[idx]; // 제곱
            } else if(carr[i] == 'T') { // 보너스 Triple
                scores[idx] *= scores[idx] * scores[idx]; // 세제곱
            } else if (carr[i] == '*') { // 이전 라운드와 현재 라운드에 *2
                if (idx > 0) scores[idx-1] *=2;
                scores[idx] *= 2;
            } else if (carr[i] == '#') { // 현재 라운드에 * -1
                scores[idx] *= -1;
            }
        }
        return scores[0] + scores[1] + scores[2];
    }
}
