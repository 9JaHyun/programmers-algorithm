package _17_Lottery;

public class Sol1 implements Question17 {

    @Override
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int wildcard = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                wildcard++;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    count++;
                }
            }
        }

        int max = calcRank(count + wildcard);
        int min = count < 2 ? 6 : 6 % calcRank(count);

        return new int[]{max, min};
    }

    public int calcRank(int num) {
        return switch (num) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
