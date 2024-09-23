import java.util.*;
import java.io.*;

class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    boolean[] status = new boolean[200001];
    public int solution(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(status[num]){
                int temp = map.get(num);
                map.replace(num, temp++);
            } else {
                status[num] = true;
                map.put(num, 1);
            }
         
        }
        int size = map.size();
        int answer = 0;
        if(size>=nums.length/2){
            answer = nums.length/2;
        } else {
            answer = size;
        }
        
        
        return answer;
    }
}