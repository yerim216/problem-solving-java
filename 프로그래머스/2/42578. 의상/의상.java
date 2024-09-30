import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], 1);   
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer *= it.next().intValue()+1;
        }
        
        return answer-1;
    }
}