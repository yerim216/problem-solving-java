import java.util.*;
class Solution {
    //100,000,000,00
    //n^2 절대 X. O(n)에 끝내야 함. 
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant){
            if(map.containsKey(s)){
                int curValue = map.get(s);
                map.put(s, ++curValue);
            } else{
                map.put(s, 1);
            }
        }
        String answer = "";
        
        for(String s : completion){
            if(map.containsKey(s)){
                int curValue = map.get(s);
                if(curValue==1){
                    map.remove(s);
                } else{
                    map.put(s, --curValue);
                }
            }
        }
        for(String s : map.keySet()){
            answer = s;
        }
        return answer;
        
    }
}