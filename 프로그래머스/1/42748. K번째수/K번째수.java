import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        
        int idx = 0;
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            for(int q=i-1; q<=j-1; q++){
                list.add(array[q]);
            }
            Collections.sort(list);
            answer[idx++] = list.get(k-1);
            
            list.clear();
            
        }
        
        return answer;
    }
}