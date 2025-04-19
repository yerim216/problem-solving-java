import java.util.*;
class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s : completion){
            map.put(s, map.get(s)-1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>0){
                return entry.getKey();
            }
        }
//         for(String s : participant){
//             if(map.containsKey(s)){
//                 int curValue = map.get(s);
//                 map.put(s, ++curValue);
//             } else{
//                 map.put(s, 1);
//             }
//         }
         String answer = "";
        
//         for(String s : completion){
//             if(map.containsKey(s)){
//                 int curValue = map.get(s);
//                 if(curValue==1){
//                     map.remove(s);
//                 } else{
//                     map.put(s, --curValue);
//                 }
//             }
//         }
//         for(String s : map.keySet()){
//             answer = s;
//         }
        return answer;
        
    }
}