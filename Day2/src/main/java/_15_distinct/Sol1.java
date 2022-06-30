package _15_distinct;

import java.util.ArrayList;

public class Sol1 implements Question15{

    @Override
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        int saveNum = -1;
        for(int i=0; i<arr.length; i++){
            if(saveNum != arr[i]){
                saveNum=arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
