import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] people, int limit) {
        //Deque<Integer> dq = new 
        int answer = 0;
        
        // for(int i=0; i<people.length; i++){
        //     dq.add(people[i]);
        // }
        
        Integer[] newPeople = Arrays.stream(people).boxed().toArray(Integer[]::new);
        
        //Arrays.sort(arr3, Collections.reverseOrder());
        Arrays.sort(newPeople, Collections.reverseOrder());
        
        int weight = 0;
        int last = newPeople.length-1;
        //System.out.print(last);
        for(int i=0; i<newPeople.length; i++){
            if(last<i){
                return answer;
            } else if(last==i){
                return ++answer;
            }
            int first = newPeople[i];
            int second = newPeople[last];
            //System.out.println(first +" "+ second);
            if(first+second<=limit){
                if(last-i==1){
                    return ++answer;
                } 
                last--;
            }
            answer ++;
        }
        
        return answer;
    }
        
}
