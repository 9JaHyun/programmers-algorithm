package _08_sort_desc;

import java.util.Arrays;

// 타입 변환
public class Sol1 implements Question8 {

    @Override
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}
