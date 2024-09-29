import java.util.*;
import java.io.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<completion.length; i++){
            if(hashMap.containsKey(completion[i])){
                int cnt = hashMap.get(completion[i]);
                hashMap.replace(completion[i], cnt+1);
            } else {
                hashMap.put(completion[i], 1);
            }
            
        }
        
        String answer = "";
        for(int j=0; j<participant.length; j++){
            if(!hashMap.containsKey(participant[j])){
                answer = participant[j];
                break;
            } else {
                int cnt = hashMap.get(participant[j]);
                if(cnt<=0){
                    answer = participant[j];
                    break;
                } else{
                    hashMap.replace(participant[j], cnt-1);
                }
            }
        }
        
        return answer;
    }
}