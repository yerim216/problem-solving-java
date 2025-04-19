import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int mapSize = map.size();
        if(mapSize>=cnt){ ///모든 종류를 다르게
            answer = cnt;
        } else{
            answer = mapSize;
        }
        return answer;
    }
}