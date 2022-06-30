package _14_min_lectangle;

// 각 차원의 최대값만 구하면 되는 문제다.
public class Sol1 implements Question14 {

    @Override
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return width * height;
    }
}
