import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        for(int[] size : sizes){
            max = Math.max(size[0], max);
            max = Math.max(size[1], max);
        }
        //case : max가 가로
        int min = 0;
        List<Integer> list = new ArrayList<>();
        for(int[] size : sizes){
            min = Math.min(size[0], size[1]);
            list.add(min);
        }
        Collections.sort(list, Collections.reverseOrder());
        int temp_1 = list.get(0);
        int answer_1 = temp_1 * max;
        
        //case : max가 세로
        for(int[] size : sizes){
            min = Math.min(size[0], size[1]);
            list.add(min);
        }
        Collections.sort(list, Collections.reverseOrder());
        int temp_2 = list.get(0);
        int answer_2 = temp_2 * max;
        
        return Math.min(answer_1, answer_2);
    }
}