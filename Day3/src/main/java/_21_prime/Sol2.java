package _21_prime;

// 에라토스테네스의 체를 이용해 미리 소수 구하기
public class Sol2 {
    public int solution(int[] nums) {
        // 1이상 1000이하의 자연수 -> 제일 커봤자 1000 + 999 + 998
        boolean[] arr = new boolean[3001];
        arr[0] = arr[1] = true;

        //에라토스테네스의 체
        for(int i = 2; i * i <= 3000; i++){
            if(!arr[i]){
                for(int j = i * i; j <= 3000; j += i){
                    arr[j] = true;
                }
            }
        }

        int count = 0;
        int size = nums.length;

        for(int i = 0; i < size - 2; i++){
            for(int j = i + 1; j < size - 1; j++){
                for(int k = j + 1; k < size; k++){
                    if(!arr[nums[i] + nums[j] + nums[k]]) count++;
                }
            }
        }
        return count;
    }

}
